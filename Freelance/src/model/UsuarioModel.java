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

import controller.Persist;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.Servico;
import controller.Usuario;
import javax.swing.JOptionPane;

public class UsuarioModel {
    private ConnectionDb cdb;
    
    public UsuarioModel(ConnectionDb cdb) {
        this.cdb = cdb;
    }
    
    public void selectUsuarios(){
        
    }
    
    public void populateUsuarios(int tipo){
        try {
            if(tipo != 1 && tipo != 2)
                throw new IllegalArgumentException("Tipo de usuário inválido");
            
            String queryUsuarios = "SELECT * FROM usuario WHERE permission = " + tipo + " ORDER BY email";
            ResultSet rs = cdb.selectQuery(queryUsuarios);
            while(rs.next()){
                Usuario usuario = new Usuario(
                        rs.getInt("permission"),
                        rs.getString("cpf_cnpj"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                
                Persist.getListUsuarios().add(usuario);
            }
            cdb.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(ServicoModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ServicoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
