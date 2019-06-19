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
public abstract class Persist {
    private static Usuario user;
    private static PerfilModel pm;

    public static PerfilModel getPerfilModel() {
        return pm;
    }

    public static void setPerfilModel(PerfilModel pm) {
        Persist.pm = pm;
    }
    
    public static Usuario getUser() {
        return user;
    }

    public static void setUser(Usuario user) {
        Persist.user = user;
    }
    
}
