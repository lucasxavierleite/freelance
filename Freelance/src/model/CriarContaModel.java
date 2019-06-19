/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class CriarContaModel {
   
    private ConnectionDb cdb = new ConnectionDb();
    
    
    public void cadastraUsuario(){
        try {
            Usuario user = Persist.getUser();
            PerfilModel pm = Persist.getPerfilModel();
            cdb.insertQuery("INSERT INTO perfil(name, birthday, cpf_cnpj, university, professionalDesc) VALUES('"+pm.getNome()+"','"+pm.getDataNasc()+"','"+pm.getCpf_cnpj()+"','"+pm.getUniversidade()+"','"+pm.getDescricaoProf()+"')");
            cdb.getCon().close();
            SecurePassword sp = new SecurePassword();
            System.out.println(securePassword);
            cdb.insertQuery("INSERT INTO usuario(permission, email, password, cpf_cnpj) VALUES("+user.getPermissao()+",'"+user.getEmail()+"','"+securePassword+"','"+user.getCpf_cnpj()+"');");
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CriarContaModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao criar conta:\n"+ex.getMessage());
        }
    }
}
