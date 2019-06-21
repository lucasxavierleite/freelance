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
import controller.ServicoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class CriarServicoModel {
    
    private ConnectionDb cdb;
    
    public void createServico(ServicoController sc){
        try {
            String query = "INSERT INTO servico(descricao,valor,nomeEmpresa, servico,"
                    + " dataAnuncio, cidade, estado, emailEmpresa, entrega, presenca,"
                    + " transporte, categorias)"
                    + " VALUES ('"+sc.getDescricao()+"',"
                    + ""+sc.getValor()+","
                    + "'"+Persist.getPerfilModel().getNome()+"',"
                    + "'"+sc.getServico()+"',"
                    + "'"+sc.getDataAnuncio()+"',"
                    + "'"+sc.getCidade()+"',"
                    + "'"+sc.getEstado()+"',"
                    + "'"+sc.getEmailEmpresa()+"',"
                    + "'"+sc.getEntrega()+"',"
                    + ""+sc.isPresenca()+","
                    + ""+sc.isTransporte()+","
                    + "'"+sc.getCategorias()+"')";
            cdb = new ConnectionDb();
            cdb.insertQuery(query);
            cdb.getCon().close();
            JOptionPane.showMessageDialog(null, "Serviço criado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CriarServicoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
