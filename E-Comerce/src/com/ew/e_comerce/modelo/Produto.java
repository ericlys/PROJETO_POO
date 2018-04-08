package com.ew.e_comerce.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe contém dados de cada produto da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Produto implements Serializable{
    private int id;
    private String nome;
    private String descricao;
    private String slug;
    private LocalDate dtInclusao;
    private LocalDate dtUpdate;
    private int quantEstoque;
    private float preco;
    private int codBarras;
    private Usuario usuario;
    private Categoria categoria;
    
    /**
     * Construtor default da classe "Produto"
     */

    public Produto() {
        
    }
    
    /**
     * Construtor da classe "Produto"
     * @param id Atributo que representa a identificação para o produto
     * @param nome Atributo que representa o nome para a produto
     * @param descricao Atributo que representa a descrição para o produto
     * @param slug Atributo que representa o endereço web para o produto
     * @param dtInclusao Atributo que representa a data de inclusão para o produto
     * @param dtUpdate Atributo que representa a data de atualização para o produto
     * @param quantEstoque Atributo que representa a quantidade em estoque para o produto
     * @param preco Atributo que representa o preço para o produto
     * @param codBarras Atributo que representa o código de barras para o produto
     * @param usuario Atributo que armazena o identificador do Usuário que cadastra um produto
     * @param categoria Atributo que armazena o identificador da categoria a qual pertence um produto
     **/

    public Produto(int id, String nome, String descricao, String slug, LocalDate dtInclusao, LocalDate dtUpdate, int quantEstoque, float preco, int codBarras, Usuario usuario, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.slug = slug;
        this.dtInclusao = dtInclusao;
        this.dtUpdate = dtUpdate;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
        this.codBarras = codBarras;
        this.usuario = usuario;
        this.categoria = categoria;
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

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.descricao);
        hash = 89 * hash + Objects.hashCode(this.slug);
        hash = 89 * hash + Objects.hashCode(this.dtInclusao);
        hash = 89 * hash + Objects.hashCode(this.dtUpdate);
        hash = 89 * hash + this.quantEstoque;
        hash = 89 * hash + Float.floatToIntBits(this.preco);
        hash = 89 * hash + this.codBarras;
        hash = 89 * hash + Objects.hashCode(this.usuario);
        hash = 89 * hash + Objects.hashCode(this.categoria);
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
        if (this.codBarras != other.codBarras) {
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
