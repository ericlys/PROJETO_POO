package com.ew.e_comerce.modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Classe que armazena dados do relacionamento entre fornecedor e produto;
 * @author Eríclys e Wanielton
 * @version 1.0
 */

public class Abastece {
    private ArrayList<Fornecedor> fornecedor;
    private ArrayList<Produto> produto;
    
    /**
     * Construtor para a classe "Abastece"
     * @param fornecedor Armazena o fornecedor que abastece algum produto
     * @param produto Armazena o produto que é abastecido por um fornecedor
     */

    public Abastece(ArrayList<Fornecedor> fornecedor, ArrayList<Produto> produto) {
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public ArrayList<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ArrayList<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.fornecedor);
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
        final Abastece other = (Abastece) obj;
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }
    
    
}
