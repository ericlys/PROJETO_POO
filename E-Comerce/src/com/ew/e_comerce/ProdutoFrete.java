package com.ew.e_comerce;

import java.util.ArrayList;
import java.util.Objects;

public class ProdutoFrete {
    private ArrayList<Produto> produto;
    private ArrayList<Frete> frete;

    public ProdutoFrete(ArrayList<Produto> produto, ArrayList<Frete> frete) {
        this.produto = produto;
        this.frete = frete;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public ArrayList<Frete> getFrete() {
        return frete;
    }

    public void setFrete(ArrayList<Frete> frete) {
        this.frete = frete;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.produto);
        hash = 79 * hash + Objects.hashCode(this.frete);
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
        final ProdutoFrete other = (ProdutoFrete) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.frete, other.frete)) {
            return false;
        }
        return true;
    }
    
    
    
}
