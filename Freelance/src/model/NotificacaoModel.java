/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.NotificacaoController;
import controller.Persist;
import controller.ServicoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class NotificacaoModel {
    
    private ConnectionDb cdb;
    
    public void populateNotificacoes(){
        try {
            cdb = new ConnectionDb();
            ResultSet rs = cdb.selectQuery("SELECT * FROM servico LEFT JOIN proposta ON servico.id=proposta.fk_idServico AND proposta.emailDest='"+Persist.getUser().getEmail()+"'");
            NotificacaoController nc = new NotificacaoController();
            while(rs.next()){
                ServicoController sc = new ServicoController(
                        rs.getString("descricao"),
                        rs.getString("servico"),
                        rs.getString("dataAnuncio"),
                        rs.getString("cidade"),
                        rs.getString("estado"),
                        rs.getString("emailEmpresa"),
                        rs.getString("entrega"),
                        rs.getString("categorias"),
                        rs.getString("nomeEmpresa"),
                        rs.getInt("id"),
                        rs.getBoolean("presenca"),
                        rs.getBoolean("transporte"));
                nc.setServicoController(sc);
                nc.setEmailRemetente(rs.getString("emailEnvio"));
            }
            cdb.getCon().close();
            
            Persist.getListNotificacao().add(nc);
        } catch (SQLException ex) {
            Logger.getLogger(NotificacaoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
