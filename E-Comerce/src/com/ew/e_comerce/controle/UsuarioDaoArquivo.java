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


public class UsuarioDaoArquivo {
    private final File file;
    
  
 public UsuarioDaoArquivo() throws IOException{
     file = new File("src\\com\\ew\\e_comerce\\arquivos\\Usuarios.bin");
     
    if (!file.exists()) {
            file.createNewFile();
        }
}
 
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
  
  
    public Usuario buscar(String email) throws IOException, ClassNotFoundException {
        List<Usuario> usuarios = listar();

        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
    
    public List<Usuario> listar() throws IOException, ClassNotFoundException {

        if (file.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            return (List<Usuario>) in.readObject();

        } else {
            return new ArrayList<>();
        }

    }
    
    
    public boolean deletar(Usuario u) throws IOException, ClassNotFoundException {

        List<Usuario> usuarios = listar();

        if (usuarios.remove(u)) {
            atualizarArquivo(usuarios);
            return true;
        } else {
            return false;
        }
    }

    
    public boolean atualizar(Usuario u) throws IOException, ClassNotFoundException {

        List<Usuario> usuarios = listar();

        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getEmail().equals(u.getEmail())){
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