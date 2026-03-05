package com.example.aula03databasepoojunit.model;

import java.util.List;

public class Fornecedor {

    private long id;
    private String nome;
    private String contato;
    private long enderecoID;
    private List<Produto> produtos;

    public Fornecedor() {}

    public Fornecedor(String nome, String contato, long enderecoID) {
        this.nome = nome;
        this.contato = contato;
        this.enderecoID = enderecoID;
    }

    public Fornecedor(long id, String nome, String contato, long enderecoID) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.enderecoID = enderecoID;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", enderecoID=" + enderecoID +
                ", produtos=" + produtos +
                '}';
    }
}
