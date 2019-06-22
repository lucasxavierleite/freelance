/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Persist;
import controller.ServicoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class PropostaModel {
    private ConnectionDb cdb;
    
    
    public void enviarProposta(ServicoController sc){
        try {
            cdb = new ConnectionDb();
            String query = "INSERT INTO proposta(fk_idServico, emailDest,emailEnvio, visualizado) VALUES ("+sc.getId()+",'"+sc.getEmailEmpresa()+"','"+Persist.getUser().getEmail()+"',0)";
            cdb.insertQuery(query);
            cdb.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(PropostaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
