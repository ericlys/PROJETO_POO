package com.ew.e_comerce.controle;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.ew.e_comerce.modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Essa classe contém os métodos CRUD para a classe "Usuario".
 *
 * @author Eríclys 
 * @version 1.0
 */

public class UsuarioDaoArquivo {

    private final File file;

    /**Metodo para criar ou abrir arquivo onde sera salvo os dados sobre os Usuarios
     *
     * @throws IOException - se houver erro na leitura do arquivo
     */
    public UsuarioDaoArquivo() throws IOException {
        file = new File("src\\com\\ew\\e_comerce\\arquivos\\Usuarios.bin");

        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**Método para salvar um novo cadastrado do usuario.
     *
     * @param u - usuario
     * @return - retorna um boolean, true se concluido com exito ou falso caso
     * contrario.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean salvar(Usuario u) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = listar();

        if (buscar(u.getEmail()) == null) {
            if (usuarios.add(u)) {
                atualizarArquivo(usuarios);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**Método para buscar um usuario pelo email
     *
     * @param email - email a ser ultilizado na busca
     * @return - retorna um usuario, caso contrario retorna null;
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Usuario buscar(String email) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = listar();

        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    /**Método para listar todos os usuarios cadastrados
     *
     * @return lista contendo todos os usuarios
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List<Usuario> listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Usuario>) in.readObject();

        } else {
            return new ArrayList<>();
        }

    }

    /**Metodo que exclui um usuario já cadastrado
     *
     * @param u - usuario a ser removido
     * @return boolean para validar a operação
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean deletar(Usuario u) throws IOException, ClassNotFoundException {

        List<Usuario> usuarios = listar();

        if (usuarios.remove(u)) {
            atualizarArquivo(usuarios);
            return true;
        } else {
            return false;
        }
    }

    /**Metodo que retorna atualiza um usuario que já esteja cadastrado
     *
     * @param u - usuario
     * @return - um boolean para para validar a operação
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public boolean atualizar(Usuario u) throws IOException, ClassNotFoundException {

        List<Usuario> usuarios = listar();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEmail().equals(u.getEmail())) {
                usuarios.set(i, u);
                atualizarArquivo(usuarios);
                return true;
            }
        }
        return false;
    }

    private void atualizarArquivo(List<Usuario> usuarios) throws IOException, ClassNotFoundException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(usuarios);
        out.close();

    }

}
