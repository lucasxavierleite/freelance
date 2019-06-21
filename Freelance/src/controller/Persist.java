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
public abstract class Persist {
    private static Usuario user;
    private static Perfil pm;
    private static List<Usuario> listUsuarios = new ArrayList<>();
    private static List<Perfil> listClientes = new ArrayList<>();
    private static List<Empresa> listEmpresas = new ArrayList<>();
    
    public static Perfil getPerfilModel() {
        return pm;
    }

    public static void setPerfilModel(Perfil pm) {
        Persist.pm = pm;
    }
    
    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        Persist.user = user;
    }

    public static List<Usuario> getListUsuarios() {
        return listUsuarios;
    }
    
    public static List<Perfil> getListClientes() {
        return listClientes;
    }
    
    public static List<Empresa> getListEmpresas() {
        return listEmpresas;
    }
}
