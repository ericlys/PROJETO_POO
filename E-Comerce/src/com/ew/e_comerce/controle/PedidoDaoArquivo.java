/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ew.e_comerce.controle;

import com.ew.e_comerce.modelo.Pedido;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para objetos do tipo pedido, onde serão contidos, métodos para o
 * mesmo.
 *
 * @author Eríclys
 * @version 1.0
 */
public class PedidoDaoArquivo {

    private File file;

    /**
     * Metodo para criar ou abrir arquivo onde sera salvo os dados sobre os
     * Pedidos
     *
     * @throws IOException
     */
    public PedidoDaoArquivo() throws IOException {
        file = new File("src\\com\\ew\\e_comerce\\arquivos\\Pedidos.bin");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * Método para salvar um novo Pedido no documeto pedidos.bin
     *
     * @param p - pedido a ser salvo
     * @return retorna um boolean, true se concluido com exito ou falso caso
     * contrario.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean salvar(Pedido p) throws IOException, ClassNotFoundException {
        List<Pedido> pedidos = listar();
        if (pedidos.add(p)) {
            atualizarArquivo(pedidos);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para buscaar o pedido pelo codigo de identificação do mesmo
     *
     * @param codigo do produto a ser buscado
     * @return o produto se encontrado, caso contrario null
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Pedido buscar(int codigo) throws IOException, ClassNotFoundException {
        List<Pedido> pedidos = listar();

        for (Pedido p : pedidos) {
            if (p.getId() == codigo) {
                return p;
            } else {
            }
        }
        return null;
    }

    private void atualizarArquivo(List<Pedido> pedidos) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(pedidos);
        out.close();
    }

    private List<Pedido> listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Pedido>) in.readObject();

        } else {
            return new ArrayList<>();
        }
    }

}
