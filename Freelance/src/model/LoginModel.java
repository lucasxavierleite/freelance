
package model;

import controller.Usuario;
import controller.Persist;
import controller.Perfil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Freelance;
/**
 * Classe responsável por realizar o login
 * @author daniel
 */
public class LoginModel {
    
    private ConnectionDb connDb = new ConnectionDb();
    private Usuario user;

    /**
     * Realiza o login, usa a função hash SHA-512 para conferir com a do banco de dados
     * @param email Email passado pelo usuário
     * @param senha Senha passada pelo usuário
     * @return true para sucesso, false para falha
     */
    public boolean login(String email, String senha){
        SecurePassword sp = new SecurePassword();
        String secPass = sp.securePassword(senha);
        ResultSet rs = connDb.selectQuery("SELECT * FROM usuario WHERE email='"+email+"' AND password='"+secPass+"'");
        try {
            if(rs.next()){
                user = new Usuario(rs.getInt("permission"),rs.getString("cpf_cnpj"), email, senha);
                rs = connDb.selectQuery("SELECT * FROM perfil where cpf_cnpj='"+user.getCpf_cnpj()+"'");
                Perfil pm;
                if(rs.next()){
                    pm = new Perfil(rs.getString("name"),
                            rs.getString("cpf_cnpj"),
                            rs.getString("university"),
                            rs.getString("professionalDesc"),
                            rs.getString("birthday"), 
                            rs.getString("escolaridade"),
                            rs.getString("cidade"),
                            rs.getString("cep"),
                            rs.getString("experiencias"),
                            rs.getString("motivacao"),
                            rs.getString("especializacao"),
                            rs.getString("areaAtuacao"),
                            rs.getInt("anoFormacao"),
                            rs.getString("estado"));
                    Persist.setPerfilModel(pm); //Perfil carregado na persistência
                }
                Persist.setUser(user);
                return true;
            }else{
                //Usuário não encontrado
                JOptionPane.showMessageDialog(null, "Email ou Senha inválidos");
            }
            connDb.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
