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
    private List<ServicoController> servicoList = new ArrayList<>();

    public List<ServicoController> getServicoList() {
        return servicoList;
    }

    public void setServicoList(List<ServicoController> servicoList) {
        this.servicoList = servicoList;
    }
    
    
    
    
}
