
package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import freelance.Freelance;
/**
 *
 * @author daniel
 */
public class LoginModel {
    
    private ConnectionDb connDb = new ConnectionDb();
    private Usuario user;
    public boolean login(String email, String senha){
        SecurePassword sp = new SecurePassword();
        String secPass = sp.securePassword(senha);
        System.out.println(secPass);
        ResultSet rs = connDb.selectQuery("SELECT * FROM usuario WHERE email='"+email+"' AND password='"+secPass+"'");
        try {
            if(rs.next()){
                user = new Usuario(rs.getInt("permission"),rs.getString("cpf_cnpj"), email, senha);
                rs = connDb.selectQuery("SELECT * FROM perfil where cpf_cnpj='"+user.getCpf_cnpj()+"'");
                PerfilModel pm;
                if(rs.next()){
                    pm = new PerfilModel(rs.getString("name"), rs.getString("cpf_cnpj"), rs.getString("university"), rs.getString("professionalDesc"), rs.getString("birthday"));
                    Persist.setPerfilModel(pm);
                }
                Persist.setUser(user);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Email ou Senha inválidos");
            }
            connDb.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
