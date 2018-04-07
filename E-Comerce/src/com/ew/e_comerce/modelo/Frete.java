package com.ew.e_comerce.modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe contém dados de cada frete dos produtos da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Frete {
    private int id;
    private String cepInicial;
    private String cepFinal;
    private float valor;
    private ArrayList<Usuario> usuario;
    
    /**
     * Construtor da classe "Frete"
     * @param id Atributo que representa a identificação para o frete
     * @param cepInicial Atributo que representa o cep inicial de uma lista para o frete 
     * @param cepFinal Atributo que representa o cep final de uma lista para o frete
     * @param valor Atributo que representa o valor para o frete que se encontre entre a lista de fretes
     * @param usuario Atributo que armazena o usuário que cadastra um frete
     */ 

    public Frete(int id, String cepInicial, String cepFinal, float valor, ArrayList<Usuario> usuario) {
        this.id = id;
        this.cepInicial = cepInicial;
        this.cepFinal = cepFinal;
        this.valor = valor;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCepInicial() {
        return cepInicial;
    }

    public void setCepInicial(String cepInicial) {
        this.cepInicial = cepInicial;
    }

    public String getCepFinal() {
        return cepFinal;
    }

    public void setCepFinal(String cepFinal) {
        this.cepFinal = cepFinal;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
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
        hash = 83 * hash + Objects.hashCode(this.cepInicial);
        hash = 83 * hash + Objects.hashCode(this.cepFinal);
        hash = 83 * hash + Float.floatToIntBits(this.valor);
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
        final Frete other = (Frete) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.cepInicial, other.cepInicial)) {
            return false;
        }
        if (!Objects.equals(this.cepFinal, other.cepFinal)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }   
}
