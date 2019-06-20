/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Perfil;
import controller.Persist;
import controller.Usuario;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author daniel
 */
public class CriarContaModel {
   
    private ConnectionDb cdb = new ConnectionDb();
    
    
    public boolean cadastraUsuario(){
        try {
            Usuario user = Persist.getUser();
            Perfil pm = Persist.getPerfilModel();
            ResultSet rs = cdb.selectQuery("SELECT * from perfil where cpf_cnpj='"+pm.getCpf_cnpj()+"';");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "CPF/CNPJ já cadastrado");
                return false;
            }
            cdb.getCon().close();
            rs = cdb.selectQuery("SELECT * from usuario where email='"+user.getEmail()+"';");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Email já cadastrado");
                return false;
            }
            cdb.getCon().close();
            cdb.insertQuery("INSERT INTO perfil(name, birthday, cpf_cnpj, university, professionalDesc) VALUES('"+pm.getNome()+"','"+pm.getDataNasc()+"','"+pm.getCpf_cnpj()+"','"+pm.getUniversidade()+"','"+pm.getDescricaoProf()+"')");
            cdb.getCon().close();
            String secPass = SecurePassword.securePassword(user.getSenha());
            cdb.insertQuery("INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES("+user.getPermissao()+",'"+user.getEmail()+"','"+secPass+"','"+user.getCpf_cnpj()+"');");
            cdb.getCon().close();
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CriarContaModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao criar conta:\n"+ex.getMessage());
        }
        return true;
    }
}
