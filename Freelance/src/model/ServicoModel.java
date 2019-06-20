/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daniel
 */

import controller.Persist;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import controller.Servico;

public class ServicoModel {
    private ConnectionDb cdb;
    
    public void selectServico(){
        
    }
    
    public void populateServico(){
        try {
            ResultSet rs = cdb.selectQuery("SELECT * FROM servico ORDER BY area");
            while(rs.next()){
                Servico serv = new Servico(
                        rs.getString("descricao"),
                        rs.getString("servico"),
                        rs.getString("dataAnuncio"),
                        rs.getString("cidade"),
                        rs.getString("estado"),
                        rs.getString("emailEmpresa"),
                        rs.getString("entrega"),
                        rs.getString("categorias"),
                        rs.getFloat("valor"),
                        rs.getBoolean("presenca"),
                        rs.getBoolean("transporte"),
                        rs.getInt("id")
                );
                Persist.getListServico().add(serv);
                
            }
            cdb.getCon().close();
            for(Servico s : Persist.getListServico()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServicoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
