package com.ew.e_comerce.dao;

import java.util.ArrayList;
import java.util.List;
import com.ew.e_comerce.entidades.Produto;

/**
 * Essa classe contém os métodos CRUD para a classe "Produto".
 * @author Eríclys e Wanielton
 * @version 1.0
 */

public class ProdutoDao {
    
    List<Produto> listaProdutos = new ArrayList<>();
    
    /**
     * Método para salvar o registro do produto fornecido pelo usuário.
     * @param produto 
     * @return False se não for possível adicionar a lista e true se for possível.
     */

    public boolean salvarProduto(Produto produto) {
        try {
            listaProdutos.add(produto);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    /**
     * Método para remover um produto já cadastrado.
     * @param id 
     * @return Se o id recebido for igual ao id de um dos produtos, este será removido.
     */

    public boolean deletarProduto(int id) {

        for (Produto produto : listaProdutos) {

            if (produto.getId() == id) {
                listaProdutos.remove(produto);
            }
        }
        return true;
    }
    
    /**
     * Método para listar todos os produtos cadastrados.
     * @return Todos os objetos contidos no arraylist de nome "listaProdutos"
     */

    public List<Produto> listarProduto() {

        return this.listaProdutos;
    }
    
    /**
     * Método para modificar um produto já cadastrado.
     * @param produto
     * @return Produto com as modificações feitas pelo usuário.
     */

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
