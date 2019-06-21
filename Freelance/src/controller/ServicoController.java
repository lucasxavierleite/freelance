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
public class ServicoController {
    private String descricao, servico, dataAnuncio, cidade, estado, emailEmpresa, entrega, categorias, empresa;
    private float valor;
    private boolean presenca, transporte;
    private int id;
    
    public ServicoController(String descricao, String servico, String dataAnuncio, String cidade, String estado, String emailEmpresa, String entrega, String categorias, float valor, boolean presenca, boolean transporte, int id, String empresa) {
        this.descricao = descricao;
        this.servico = servico;
        this.dataAnuncio = dataAnuncio;
        this.cidade = cidade;
        this.estado = estado;
        this.emailEmpresa = emailEmpresa;
        this.entrega = entrega;
        this.categorias = categorias;
        this.valor = valor;
        this.presenca = presenca;
        this.transporte = transporte;
        this.id = id;
        this.empresa = empresa;
    }

    public ServicoController(String descricao, String servico, String dataAnuncio, String cidade, String estado, String emailEmpresa, String entrega, String categorias, String empresa, float valor, boolean presenca, boolean transporte) {
        this.descricao = descricao;
        this.servico = servico;
        this.dataAnuncio = dataAnuncio;
        this.cidade = cidade;
        this.estado = estado;
        this.emailEmpresa = emailEmpresa;
        this.entrega = entrega;
        this.categorias = categorias;
        this.empresa = empresa;
        this.valor = valor;
        this.presenca = presenca;
        this.transporte = transporte;
    }

   
    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getDataAnuncio() {
        return dataAnuncio;
    }

    public void setDataAnuncio(String dataAnuncio) {
        this.dataAnuncio = dataAnuncio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
