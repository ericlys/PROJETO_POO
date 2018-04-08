package com.ew.e_comerce.controle;

import java.util.ArrayList;
import java.util.List;
import com.ew.e_comerce.modelo.Produto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Essa classe contém os métodos CRUD para a classe "Produto".
 *
 * @author Eríclys e Wanielton
 * @version 1.0
 */
public class ProdutoDaoArquivo {

    private final File file;

    public ProdutoDaoArquivo() throws IOException {
        file = new File("src\\com\\ew\\e_comerce\\arquivos\\Produtos.bin");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * Método para salvar o registro do produto fornecido pelo usuário.
     *
     * @param produto
     * @return False se não for possível adicionar a lista e true se for
     * possível.
     */
    public boolean salvar(Produto p) throws IOException, ClassNotFoundException {
        List<Produto> produtos = listar();

        if (buscar(p.getId()) == null) {
            if (produtos.add(p)) {
                atualizarArquivo(produtos);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public Produto buscar(int codigo) throws IOException, ClassNotFoundException {
        List<Produto> produtos = listar();

        for (Produto p : produtos) {
            if (p.getId() == codigo){
                return p;
            }
        }
        return null;
    }

    /**
     * Método para remover um produto já cadastrado.
     *
     * @param id
     * @return Se o id recebido for igual ao id de um dos produtos, este será
     * removido.
     */
    public boolean deletar(Produto p) throws IOException, ClassNotFoundException {

        List<Produto> produtos = listar();

        if (produtos.remove(p)) {
            atualizarArquivo(produtos);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para listar todos os produtos cadastrados.
     *
     * @return Todos os objetos contidos no arraylist de nome "listaProdutos"
     */
    public List<Produto> listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Produto>) in.readObject();

        } else {
            return new ArrayList<>();
        }

    }

    /**
     * Método para modificar um produto já cadastrado.
     *
     * @param produto
     * @return Produto com as modificações feitas pelo usuário.
     */
    
    public boolean atualizar(Produto p) throws IOException, ClassNotFoundException {

        List<Produto> produtos = listar();

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == p.getId()) {
                produtos.set(i, p);
                atualizarArquivo(produtos);
                return true;
            }
        }
        return false;
    }

    private void atualizarArquivo(List<Produto> produtos) throws IOException, ClassNotFoundException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(produtos);
        out.close();

    }
}
