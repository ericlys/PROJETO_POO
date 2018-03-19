package com.ew.e_comerce.entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Relação que armazena dados de cada destinatário de cada usuário da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Destinatario {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private int idEnd;
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    private String complemento;
    private String cep;
    private int numero;
    private ArrayList<Usuario> usuario; 
    
    /**
     * Construtor da classe "Destinatário"
     * @param id Atributo que representa a identificação para o destinatário
     * @param nome Atributo que armazena o nome completo do destinatário
     * @param cpf Atributo que representa o cpf do destinatário
     * @param telefone Atributo que representa o número de telefone do destinatário
     * @param idEnd Atributo que representa a identificação para o endereço do destinatário
     * @param pais Atributo que representa o país para o endereço do destinatário
     * @param estado Atributo que representa o estado para o endereço do destinatário
     * @param cidade Atributo que representa a cidade para o endereço do destinatário
     * @param rua Atributo que representa a rua para o endereço do destinatário
     * @param complemento Atributo que representa um complemento para o endereço do destinatário
     * @param cep Atributo que representa o código postal para o endereço do destinatário
     * @param numero Atributo que armazena o número da casa referente ao endereço do destinatário
     * @param usuario Atributo que armazena o usuário que tem um destinatário
     */

    public Destinatario(int id, String nome, String cpf, String telefone, int idEnd, String pais, String estado, String cidade, String rua, String complemento, String cep, int numero, ArrayList<Usuario> usuario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idEnd = idEnd;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.cpf);
        hash = 89 * hash + Objects.hashCode(this.telefone);
        hash = 89 * hash + this.idEnd;
        hash = 89 * hash + Objects.hashCode(this.pais);
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + Objects.hashCode(this.cidade);
        hash = 89 * hash + Objects.hashCode(this.rua);
        hash = 89 * hash + Objects.hashCode(this.complemento);
        hash = 89 * hash + Objects.hashCode(this.cep);
        hash = 89 * hash + this.numero;
        hash = 89 * hash + Objects.hashCode(this.usuario);
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
        final Destinatario other = (Destinatario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idEnd != other.idEnd) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Destinatario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", idEnd=" + idEnd + ", pais=" + pais + ", estado=" + estado + ", cidade=" + cidade + ", rua=" + rua + ", complemento=" + complemento + ", cep=" + cep + ", numero=" + numero + ", usuario=" + usuario + '}';
    }
}
