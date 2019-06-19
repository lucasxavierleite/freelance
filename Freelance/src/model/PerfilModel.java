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
public class PerfilModel {
    private String nome, cpf_cnpj, universidade, descricaoProf, dataNasc;

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getDescricaoProf() {
        return descricaoProf;
    }

    public void setDescricaoProf(String descricaoProf) {
        this.descricaoProf = descricaoProf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public PerfilModel(String nome, String cpf_cnpj, String universidade, String descricaoProf, String dataNasc) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.universidade = universidade;
        this.descricaoProf = descricaoProf;
        this.dataNasc = dataNasc;
    }

    
    
}
