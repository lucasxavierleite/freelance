/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author daniel
 */
public class Usuario {
    private int permissao;
    private String email;
    private String senha;
    private String cpf_cnpj;
    private Perfil perfil;
    private EmpresaController empresa;

    public Usuario(int permissao, String cpfCnpj, String email, String senha) {
        this.permissao = permissao;
        this.cpf_cnpj = cpfCnpj;
        this.email = email;
        this.senha = senha;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }
    
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
       
    public Perfil getPerfil() {
        return perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    public EmpresaController getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(EmpresaController empresa) {
        this.empresa = empresa;
    }
}