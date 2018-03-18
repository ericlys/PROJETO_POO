
package com.ew.e_comerce.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private int id;
    private String status;
    private String nfe;
    private LocalDate data;
    private LocalDate hora;
    private ArrayList<Usuario> usuario;
    private ArrayList<Destinatario> endereco;
    private ArrayList<Envio> envio;

    public Pedido(int id, String status, String nfe, LocalDate data, LocalDate hora, ArrayList<Usuario> usuario, ArrayList<Destinatario> endereco, ArrayList<Envio> envio) {
        this.id = id;
        this.status = status;
        this.nfe = nfe;
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.endereco = endereco;
        this.envio = envio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNfe() {
        return nfe;
    }

    public void setNfe(String nfe) {
        this.nfe = nfe;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Destinatario> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Destinatario> endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Envio> getEnvio() {
        return envio;
    }

    public void setEnvio(ArrayList<Envio> envio) {
        this.envio = envio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.status);
        hash = 19 * hash + Objects.hashCode(this.nfe);
        hash = 19 * hash + Objects.hashCode(this.data);
        hash = 19 * hash + Objects.hashCode(this.hora);
        hash = 19 * hash + Objects.hashCode(this.usuario);
        hash = 19 * hash + Objects.hashCode(this.endereco);
        hash = 19 * hash + Objects.hashCode(this.envio);
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
        final Pedido other = (Pedido) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.nfe, other.nfe)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.envio, other.envio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", status=" + status + ", nfe=" + nfe + ", data=" + data + ", hora=" + hora + ", usuario=" + usuario + ", endereco=" + endereco + ", envio=" + envio + '}';
    }

    
    
    
}
