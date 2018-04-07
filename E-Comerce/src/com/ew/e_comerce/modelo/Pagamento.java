
package com.ew.e_comerce.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Essa classe contém dados dos pagamentos;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Pagamento {
    private String codigo;
    private LocalDate dataInc;
    private String nomeTipPag;
    private float valorPago;
    private ArrayList<Pedido> pedido;
    private ArrayList<Usuario> usuario;
    
    /**
     * Construtor da classe "Pagamento"
     * @param codigo Atributo que representa a identificação do código para o pagamento
     * @param dataInc Atributo que representa a data de criação do pagamento
     * @param nomeTipPag Atributo que representa o nome para o tipo de pagamento
     * @param valorPago Atributo que representa o valor do pagamento realizado
     * @param pedido Atributo que armazena o identificador do pedido que foi pago
     * @param usuario Atributo que armazena o identificador da categoria usuário a qual realiza o pagamento
     */

    public Pagamento(String codigo, LocalDate dataInc, String nomeTipPag, float valorPago, ArrayList<Pedido> pedido, ArrayList<Usuario> usuario) {
        this.codigo = codigo;
        this.dataInc = dataInc;
        this.nomeTipPag = nomeTipPag;
        this.valorPago = valorPago;
        this.pedido = pedido;
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataInc() {
        return dataInc;
    }

    public void setDataInc(LocalDate dataInc) {
        this.dataInc = dataInc;
    }

    public String getNomeTipPag() {
        return nomeTipPag;
    }

    public void setNomeTipPag(String nomeTipPag) {
        this.nomeTipPag = nomeTipPag;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.dataInc);
        hash = 97 * hash + Objects.hashCode(this.nomeTipPag);
        hash = 97 * hash + Float.floatToIntBits(this.valorPago);
        hash = 97 * hash + Objects.hashCode(this.pedido);
        hash = 97 * hash + Objects.hashCode(this.usuario);
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
        final Pagamento other = (Pagamento) obj;
        if (Float.floatToIntBits(this.valorPago) != Float.floatToIntBits(other.valorPago)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nomeTipPag, other.nomeTipPag)) {
            return false;
        }
        if (!Objects.equals(this.dataInc, other.dataInc)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "codigo=" + codigo + ", dataInc=" + dataInc + ", nomeTipPag=" + nomeTipPag + ", valorPago=" + valorPago + ", pedido=" + pedido + ", usuario=" + usuario + '}';
    }
}
