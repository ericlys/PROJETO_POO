package com.ew.e_comerce.entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe armazena dados das categorias de cada produto;
 * @author Eríclys e Wanielton
 * @version 1.0
 */

public class Categoria {
     private int id;
    private String slug;
    private String nome;
    private ArrayList<Categoria> categoria ;
    
    /**
     * Construtor da classe "Categoria"
     * @param id Atributo que representa a identificação para a categoria
     * @param slug Atributo que representa o endereço web para a categoria 
     * @param nome Atributo que representa o nome para a categoria
     * @param categoria ArrayList que armazena o identificador da categoria a qual pertence outra categoria
     */

    public Categoria(int id, String slug, String nome, ArrayList<Categoria> categoria) {
        this.id = id;
        this.slug = slug;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.slug);
        hash = 29 * hash + Objects.hashCode(this.nome);
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
        final Categoria other = (Categoria) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.slug, other.slug)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }   
}
