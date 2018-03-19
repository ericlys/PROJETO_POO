package com.ew.e_comerce.entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe contém dados de cada item que formará o pedido;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class ItemPedido {

    private String id;
    private float desconto;
    private int quantidade;
    private float precototal;
    private ArrayList<Pedido> pedido;
    private ArrayList<Produto> produto;
    
    /**
     * Construtor da classe "ItemPedido"
     * @param id Atributo que representa a identificação para o item pedido
     * @param desconto Atributo que representa o desconto no item pedido
     * @param quantidade Atributo que representa quantidade de um produto selecionado no item pedido 
     * @param precototal Atributo que representa o preço total daquele item pedido
     * @param pedido Atributo que armazena o pedido que possui o item pedido
     * @param produto Atributo que armazena o produto que é adicionado ao item_pedido
     */

    public ItemPedido(String id, float desconto, int quantidade, float precototal, ArrayList<Pedido> pedido, ArrayList<Produto> produto) {
        this.id = id;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.precototal = precototal;
        this.pedido = pedido;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecototal() {
        return precototal;
    }

    public void setPrecototal(float precototal) {
        this.precototal = precototal;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
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
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Float.floatToIntBits(this.desconto);
        hash = 79 * hash + this.quantidade;
        hash = 79 * hash + Float.floatToIntBits(this.precototal);
        hash = 79 * hash + Objects.hashCode(this.pedido);
        hash = 79 * hash + Objects.hashCode(this.produto);
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
        final ItemPedido other = (ItemPedido) obj;
        if (Float.floatToIntBits(this.desconto) != Float.floatToIntBits(other.desconto)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Float.floatToIntBits(this.precototal) != Float.floatToIntBits(other.precototal)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "id=" + id + ", desconto=" + desconto + ", quantidade=" + quantidade + ", precototal=" + precototal + ", pedido=" + pedido + ", produto=" + produto + '}';
    }

    
    
    
}
