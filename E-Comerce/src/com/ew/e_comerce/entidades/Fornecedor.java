package com.ew.e_comerce.entidades;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Relação que armazena dados de cada fornecedor de produtos da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Fornecedor {

    private int id;
    private String cnpj;
    private String email;
    private String nome;
    private String incriEst;
    private String telefone;
    private String estado;
    private String cidade;
    private String rua;
    private String cep;
    private int numero;
    private ArrayList<Usuario> usuario;
    
    /**
     * Contrutor da classe "Fornecedor"
     * @param id Atributo que representa a identificação para o fornecedor
     * @param cnpj Atributo que representa o cnpj do fornecedor
     * @param email Atributo que representa o email do fornecedor
     * @param nome Atributo que representa o nome do fornecedor
     * @param incriEst Atributo que representa a inscrição estadual do fornecedor
     * @param telefone Atributo que representa o telefone do fornecedor
     * @param estado Atributo que representa o estado de localização do fornecedor
     * @param cidade Atributo que representa a cidade de localização do fornecedor
     * @param rua Atributo que representa a rua de localização do fornecedor
     * @param cep Atributo que representa o cep de localização do fornecedor
     * @param numero Atributo que armazena o número da empresa referente ao endereço do fornecedor
     * @param usuario Atributo que armazena o identificador do usuário que cadastra um fornecedor
     */

    public Fornecedor(int id, String cnpj, String email, String nome, String incriEst, String telefone, String estado, String cidade, String rua, String cep, int numero, ArrayList<Usuario> usuario) {
        this.id = id;
        this.cnpj = cnpj;
        this.email = email;
        this.nome = nome;
        this.incriEst = incriEst;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIncriEst() {
        return incriEst;
    }

    public void setIncriEst(String incriEst) {
        this.incriEst = incriEst;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.cnpj);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.incriEst);
        hash = 83 * hash + Objects.hashCode(this.telefone);
        hash = 83 * hash + Objects.hashCode(this.estado);
        hash = 83 * hash + Objects.hashCode(this.cidade);
        hash = 83 * hash + Objects.hashCode(this.rua);
        hash = 83 * hash + Objects.hashCode(this.cep);
        hash = 83 * hash + this.numero;
        hash = 83 * hash + Objects.hashCode(this.usuario);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.incriEst, other.incriEst)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
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
        return "Fornecedor{" + "id=" + id + ", cnpj=" + cnpj + ", email=" + email + ", nome=" + nome + ", incriEst=" + incriEst + ", telefone=" + telefone + ", estado=" + estado + ", cidade=" + cidade + ", rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", usuario=" + usuario + '}';
    }  
}
