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
public class Perfil {
    private String nome, cpf_cnpj, universidade, descricaoProf, dataNasc, escolaridade, cidade, cep,experiencia, motivacoes, especializacao, areaAtuacao, estado;
    private int anoFormacao;
    
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

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getMotivacoes() {
        return motivacoes;
    }

    public void setMotivacoes(String motivacoes) {
        this.motivacoes = motivacoes;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public int getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(int anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public Perfil(String nome, String cpf_cnpj, String universidade, String descricaoProf, String dataNasc, String escolaridade, String cidade, String cep, String experiencia, String motivacoes, String especializacao, String areaAtuacao, int anoFormacao, String estado) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.universidade = universidade;
        this.descricaoProf = descricaoProf;
        this.dataNasc = dataNasc;
        this.escolaridade = escolaridade;
        this.cidade = cidade;
        this.cep = cep;
        this.experiencia = experiencia;
        this.motivacoes = motivacoes;
        this.especializacao = especializacao;
        this.areaAtuacao = areaAtuacao;
        this.anoFormacao = anoFormacao;
        this.estado = estado;
    }

    public Perfil(String nome, String cpf_cnpj, String universidade, String descricaoProf, String dataNasc) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.universidade = universidade;
        this.descricaoProf = descricaoProf;
        this.dataNasc = dataNasc;
    }

    

    
    
}
