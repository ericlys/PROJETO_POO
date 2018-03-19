package com.ew.e_comerce.entidades;

import java.time.LocalDate;

/**
 * Relação que armazena dados de cada usuário da loja;
 * @author Eríclys e Wanileton
 * @version 1.0
 */

public class Usuario {

    private String id;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private LocalDate dtCriacao;
    private String permissao; //usuario, administrador....
    
    /**
     * Construtor da classe "Usuario"
     * @param id Atributo que representa a identificação do usuário
     * @param nome Atributo que representa o nome do usuário
     * @param sobrenome Atributo que representa o sobrenome do usuário
     * @param email Atributo que representa o email do usuário
     * @param senha Atributo que representa a senha da conta do usuário
     * @param dtCriacao Atributo que representa a data de criação da conta do usuário
     * @param permissao Atributo que armazena a permissão para o perfil do usuário
     */

    public Usuario(String id, String nome, String sobrenome, String email, String senha, LocalDate dtCriacao, String permissao) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.dtCriacao = dtCriacao;
        this.permissao = permissao;
    }

    public String getId() {
        return id;
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

}

