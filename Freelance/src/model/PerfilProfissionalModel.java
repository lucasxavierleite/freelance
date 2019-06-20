/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Persist;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class PerfilProfissionalModel {
    
    private ConnectionDb cdb;
    public void updatePerfilProfissional(){
        try {
            cdb = new ConnectionDb();
            cdb.insertQuery("UPDATE perfil set escolaridade='"+Persist.getPerfilModel().getEscolaridade()+
                    "', anoFormacao="+Persist.getPerfilModel().getAnoFormacao()+
                    ", especializacao='"+Persist.getPerfilModel().getEspecializacao()+
                    "', experiencias='"+Persist.getPerfilModel().getExperiencia()+
                    "', motivacao='"+Persist.getPerfilModel().getMotivacoes()+
                    "', university='"+Persist.getPerfilModel().getUniversidade()+
                    "', professionalDesc='"+Persist.getPerfilModel().getDescricaoProf()+
                    "' WHERE cpf_cnpj='"+Persist.getPerfilModel().getCpf_cnpj()+"'");
            cdb.getCon().close();
            JOptionPane.showMessageDialog(null, "Perfil alterado com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(PerfilProfissionalModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
