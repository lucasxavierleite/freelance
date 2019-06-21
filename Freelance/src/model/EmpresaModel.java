/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lucas
 */

import controller.Empresa;
import controller.Perfil;
import controller.Persist;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.Usuario;
import java.util.List;

public class EmpresaModel {
    private ConnectionDb cdb;
    
    public EmpresaModel(ConnectionDb cdb) {
        this.cdb = cdb;
    }
    
    public void selectEmpresas(){
        
    }
    
    public void populateEmpresas(){
        try {          
            for(Usuario usuario : Persist.getListUsuarios()) {
                if(usuario.getPermissao() != 2)
                    continue;
                    
                String query = "SELECT * FROM perfil WHERE cpf_cnpj = '" + usuario.getCpf_cnpj() + "'";
                ResultSet rs = cdb.selectQuery(query);
                rs.next();
                
                System.out.println(query);
                
                Perfil perfil = new Perfil(
                    rs.getString("name"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("cidade"),
                    rs.getString("cep"),
                    rs.getString("motivacao"),
                    rs.getString("especializacao"),
                    rs.getString("areaAtuacao"),
                    rs.getString("estado")
                );
                
                usuario.setPerfil(perfil);
                Empresa empresa = new Empresa(usuario);
                Persist.getListEmpresas().add(empresa);
            }
            
            cdb.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
