package com.ew.e_comerce.modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Essa classe contém dados de cada envio de produtos feitos pela loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Envio {
    private int id;
    private LocalDate dataEnvio;
    private LocalDate dataEntrega;
    private String codRastreamento;
    private String empresaResponsavel;
    private String tempEstEntrega;
    
    /**
     * Contrutor da classe "Envio"
     * @param id Atributo que representa a identificação para o envio
     * @param dataEnvio Atributo que representa a data de envio
     * @param dataEntrega Atributo que representa a data de entrega
     * @param codRastreamento Atributo que representa o código de rastreamento do envio
     * @param empresaResponsavel Atributo que representa o nome da empresa que cuida do envio
     * @param tempEstEntrega Atributo que representa a data estimada da entrega
     */

    public Envio(int id, LocalDate dataEnvio, LocalDate dataEntrega, String codRastreamento, String empresaResponsavel, String tempEstEntrega) {
        this.id = id;
        this.dataEnvio = dataEnvio;
        this.dataEntrega = dataEntrega;
        this.codRastreamento = codRastreamento;
        this.empresaResponsavel = empresaResponsavel;
        this.tempEstEntrega = tempEstEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getCodRastreamento() {
        return codRastreamento;
    }

    public void setCodRastreamento(String codRastreamento) {
        this.codRastreamento = codRastreamento;
    }

    public String getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public void setEmpresaResponsavel(String empresaResponsavel) {
        this.empresaResponsavel = empresaResponsavel;
    }

    public String getTempEstEntrega() {
        return tempEstEntrega;
    }

    public void setTempEstEntrega(String tempEstEntrega) {
        this.tempEstEntrega = tempEstEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.dataEnvio);
        hash = 89 * hash + Objects.hashCode(this.dataEntrega);
        hash = 89 * hash + Objects.hashCode(this.codRastreamento);
        hash = 89 * hash + Objects.hashCode(this.empresaResponsavel);
        hash = 89 * hash + Objects.hashCode(this.tempEstEntrega);
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
        final Envio other = (Envio) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.codRastreamento, other.codRastreamento)) {
            return false;
        }
        if (!Objects.equals(this.empresaResponsavel, other.empresaResponsavel)) {
            return false;
        }
        if (!Objects.equals(this.tempEstEntrega, other.tempEstEntrega)) {
            return false;
        }
        if (!Objects.equals(this.dataEnvio, other.dataEnvio)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrega, other.dataEntrega)) {
            return false;
        }
        return true;
    }  
}
