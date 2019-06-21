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
public class Empresa {
    private Usuario usuario;
    private List<Servico> listServicos = new ArrayList<>();

    public Empresa(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
   
    public List<Servico> getListServicos() {
        return listServicos;
    }
}
