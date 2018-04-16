/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ew.e_comerce.controle;

import com.ew.e_comerce.modelo.ItemPedido;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para objetos do tipo ItemPedido, onde serão contidos, métodos para o
 * mesmo.
 *
 * @author Eríclys
 * @version 1.0
 */
public class ItemPedidoDaoArquivo {

    private final File file;

    /**
     * Metodo para criar ou abrir arquivo onde sera salvo os dados sobre o item
     * pedido
     *
     * @throws IOException
     */
    public ItemPedidoDaoArquivo() throws IOException {
        file = new File("src\\com\\ew\\e_comerce\\arquivos\\PedidoItem.bin");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * Método para salvar um novo cadastrado de um item pedido.
     *
     * @param ip - item pedido
     * @return - retorna um boolean, true se concluido com exito ou falso caso
     * contrario.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean salvar(ItemPedido ip) throws IOException, ClassNotFoundException {
        List<ItemPedido> itemPedido = listar();

        if (buscar(ip.getId()) == null) {
            if (itemPedido.add(ip)) {
                atualizarArquivo(itemPedido);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Método para buscar um item pedido pelo seu codigo de identificação.
     *
     * @param id - identificador do item pedido
     * @return o item pedido, caso não encontrado retorna null
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public ItemPedido buscar(int id) throws IOException, ClassNotFoundException {
        List<ItemPedido> itempedidos = listar();

        for (ItemPedido ip : itempedidos) {
            if (ip.getId() == id) {
                return ip;
            }
        }
        return null;
    }

    /**
     * Método para listar os todos os itens pedidos
     *
     * @return lista contendo todos os pedidos
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List<ItemPedido> listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<ItemPedido>) in.readObject();

        } else {
            return new ArrayList<>();
        }

    }

    /**
     * Método para deletar um item dos pedidos
     *
     * @param ip - item a ser removido dos itens de pedido
     * @return retorna um boolean, true se concluido com exito ou falso caso
     * contrario.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean deletar(ItemPedido ip) throws IOException, ClassNotFoundException {

        List<ItemPedido> usuarios = listar();

        if (usuarios.remove(ip)) {
            atualizarArquivo(usuarios);
            return true;
        } else {
            return false;
        }
    }

    private void atualizarArquivo(List<ItemPedido> itempedidos) throws IOException, ClassNotFoundException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(itempedidos);
        out.close();

    }
}
