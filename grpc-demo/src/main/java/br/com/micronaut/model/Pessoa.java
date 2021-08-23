package br.com.micronaut.model;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.*;

@Entity
@Introspected
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
}
