package com.ew.e_comerce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String slug;
    private LocalDate dtInclusao;
    private LocalDate dtUpdate;
    private int quantEstoque;
    private float preco;
    private String codBarras;
    private ArrayList<Usuario> usuario;
    private ArrayList<Categoria> categoria;

    public Produto() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public LocalDate getDtInclusao() {
        return dtInclusao;
    }

    public void setDtInclusao(LocalDate dtInclusao) {
        this.dtInclusao = dtInclusao;
    }

    public LocalDate getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(LocalDate dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.slug);
        hash = 29 * hash + Objects.hashCode(this.dtInclusao);
        hash = 29 * hash + Objects.hashCode(this.dtUpdate);
        hash = 29 * hash + this.quantEstoque;
        hash = 29 * hash + Float.floatToIntBits(this.preco);
        hash = 29 * hash + Objects.hashCode(this.codBarras);
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.categoria);
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantEstoque != other.quantEstoque) {
            return false;
        }
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.slug, other.slug)) {
            return false;
        }
        if (!Objects.equals(this.codBarras, other.codBarras)) {
            return false;
        }
        if (!Objects.equals(this.dtInclusao, other.dtInclusao)) {
            return false;
        }
        if (!Objects.equals(this.dtUpdate, other.dtUpdate)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", slug=" + slug + ", dtInclusao=" + dtInclusao + ", dtUpdate=" + dtUpdate + ", quantEstoque=" + quantEstoque + ", preco=" + preco + ", codBarras=" + codBarras + ", usuario=" + usuario + ", categoria=" + categoria + '}';
    }

 

    
    
    
}
