package com.linuxtips.javaweekapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private String pessoaInstrutura;

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPessoaInstrutura() {
        return pessoaInstrutura;
    }

    public void setPessoaInstrutura(String pessoaInstrutura) {
        this.pessoaInstrutura = pessoaInstrutura;
    } 
    
}
