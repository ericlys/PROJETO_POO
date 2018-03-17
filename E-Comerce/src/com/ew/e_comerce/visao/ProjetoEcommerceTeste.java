package com.ew.e_comerce.visao;

import com.ew.e_comerce.Produto;
import java.util.ArrayList;
import java.util.List;
import com.ew.e_comerce.dao.ProdutoDao;

public class ProjetoEcommerceTeste {

    static ProdutoDao prod = new ProdutoDao();
    
    public static void main(String[] args) {
        
        CasosDefault();
        listarProdutos();
        prod.deletarProduto(1);
        System.out.println("--------------------------------------------------");
        listarProdutos();
        System.out.println("--------------------------------------------------");
        alterar();
        listarProdutos();
    }
    
    public static void CasosDefault() {

        Produto produto1 = new Produto();

        produto1.setNome("Sardinha");
        produto1.setId(1);
        prod.salvarProduto(produto1);
        
        Produto produto2 = new Produto();

        produto2.setNome("Livro");
        produto2.setId(2);
        prod.salvarProduto(produto2);

    }

    public static void listarProdutos() {
        List<Produto> lista = new ArrayList<>();

        lista = prod.listarProduto();
        
        for (Produto produto : lista) {
            System.out.println(produto.getNome());
            System.out.println(produto.getId());
        }
    }
    
    public static void alterar(){
        Produto produto = new Produto();
        produto.setNome(("Livros"));
        produto.setId(2);
        prod.alterarProduto(produto);
    }
}
