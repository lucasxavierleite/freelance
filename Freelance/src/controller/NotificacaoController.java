/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class NotificacaoController {
    private String emailRemetente;
    private ServicoController servicoController;

    public ServicoController getServicoController() {
        return servicoController;
    }

    public void setServicoController(ServicoController servicoController) {
        this.servicoController = servicoController;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }
    
    
    
    
    
    
}
