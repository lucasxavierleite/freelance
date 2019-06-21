/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controller.Persist;
/**
 *
 * @author daniel
 */
public class PerfilPessoalModel {
    private ConnectionDb cdb;
    public void updatePerfilPessoal(){
        try {
            cdb = new ConnectionDb();
            cdb.insertQuery("UPDATE perfil set name='"+Persist.getPerfilModel().getNome()+"',"
                    + "cep='"+Persist.getPerfilModel().getCep()+"',"
                    + "cidade='"+Persist.getPerfilModel().getCidade()+"',"
                    + "estado='"+Persist.getPerfilModel().getEstado()+"' WHERE cpf_cnpj='"+controller.Persist.getPerfilModel().getCpf_cnpj()+"'");
            cdb.getCon().close();
            JOptionPane.showMessageDialog(null, "Perfil alterado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(PerfilProfissionalModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
