package com.ew.e_comerce.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe contém dados de cada pedido;
 *
 * @author Eríclys e Wanileton
 * @version 1.0
 */
public class Pedido {

    private int id;
    private String status;
    private LocalDate data;
    private LocalDate hora;
    private Usuario usuario;
    private Destinatario endereco;
    private Envio envio;

    /**
     * Construtor da classe "Pedido"
     *
     * @param id Atributo que representa a identificação para o pedido
     * @param status Atributo que representa status para o pedido
     * @param data Atributo que representa data para o pedido
     * @param hora Atributo que representa a hora para o pedido
     * @param usuario Atributo que armazena o Usuário que realizam um pedido
     * @param endereco Atributo que armazena o endereço para o qual será enviado
     * o pedido
     * @param envio Atributo que armazena o modo pelo qual o produto foi enviado
     */
    public Pedido(int id, String status, LocalDate data, LocalDate hora, Usuario usuario, Destinatario endereco, Envio envio) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.endereco = endereco;
        this.envio = envio;
    }

    public Pedido() {
        
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Destinatario getEndereco() {
        return endereco;
    }

    public void setEndereco(Destinatario endereco) {
        this.endereco = endereco;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.status);
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
        return "Pedido{" + "id=" + id + ", status=" + status + ", data=" + data + ", hora=" + hora + ", usuario=" + usuario + ", endereco=" + endereco + ", envio=" + envio + '}';
    }
}
