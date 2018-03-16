package com.ew.e_comerce;

import java.util.ArrayList;

import java.util.Objects;

public class Especificacao {

    private int id;
    private String caracteristica;
    private String descricao;
    private ArrayList<Produto> produto;

    public Especificacao(int id, String caracteristica, String descricao, ArrayList<Produto> produto) {
        this.id = id;
        this.caracteristica = caracteristica;
        this.descricao = descricao;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.caracteristica);
        hash = 59 * hash + Objects.hashCode(this.descricao);
        hash = 59 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Especificacao other = (Especificacao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.caracteristica, other.caracteristica)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especificacao{" + "id=" + id + ", caracteristica=" + caracteristica + ", descricao=" + descricao + ", produto=" + produto + '}';
    }

    
}
