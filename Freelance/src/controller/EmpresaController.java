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
public class EmpresaController {
    private Usuario usuario;
    private static List<ServicoController> listServicos = new ArrayList<>();

    public EmpresaController(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
   
    public static List<ServicoController> getListServicos() {
        return listServicos;
    }
}
