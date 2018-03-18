package com.ew.e_comerce.dao;

import java.util.ArrayList;
import java.util.List;
import com.ew.e_comerce.entidades.Produto;

public class ProdutoDao {

    List<Produto> listaProdutos = new ArrayList<>();

    public boolean salvarProduto(Produto produto) {
        try {
            listaProdutos.add(produto);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deletarProduto(int id) {

        for (Produto produto : listaProdutos) {

            if (produto.getId() == id) {
                listaProdutos.remove(produto);
            }
        }
        return true;
    }

    public List<Produto> listarProduto() {

        return this.listaProdutos;
    }

    public boolean alterarProduto(Produto produto) {
        for (Produto produto1 : listaProdutos) {
            if (produto1.getId() == produto.getId()) {
                listaProdutos.remove(produto1);
                listaProdutos.add(produto);
            }
        }
        return true;
    }
}
