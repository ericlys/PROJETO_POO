package com.ew.e_comerce.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Relação que armazena dados de cada usuário da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Usuario implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private LocalDate dtCriacao;
    private String permissao; //cliente ou administrador
    
    /**
     * Construtor da classe "Usuario"
     * @param nome Atributo que representa o nome do usuário
     * @param sobrenome Atributo que representa o sobrenome do usuário
     * @param email Atributo que representa o email do usuário
     * @param senha Atributo que representa a senha da conta do usuário
     * @param dtCriacao Atributo que representa a data de criação da conta do usuário
     * @param permissao Atributo que armazena a permissão para o perfil do usuário
     */

    public Usuario( String nome, String sobrenome, String email, String senha, LocalDate dtCriacao, String permissao) {
  
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.dtCriacao = dtCriacao;
        this.permissao = permissao;
    }

    public Usuario() {
 
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }


    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    
    public LocalDate getDtCriação() {
        return dtCriacao;
    }

    public void setDtCriação(LocalDate dtCriação) {
        this.dtCriacao = dtCriação;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.sobrenome);
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.senha);
        hash = 17 * hash + Objects.hashCode(this.dtCriacao);
        hash = 17 * hash + Objects.hashCode(this.permissao);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.permissao, other.permissao)) {
            return false;
        }
        if (!Objects.equals(this.dtCriacao, other.dtCriacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", senha=" + senha + ", dtCriacao=" + dtCriacao + ", permissao=" + permissao + '}';
    }

    
}

