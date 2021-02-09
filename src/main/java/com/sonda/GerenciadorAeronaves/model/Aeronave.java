package com.sonda.GerenciadorAeronaves.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="aeronaves")


@ApiModel
public class Aeronave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Anotação para gerar um ID atomaticamente
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private String marca;
    @Column
    private Integer ano;
    @Column
    @Lob //Text
    private String descricao;
    @Column
    private boolean vendido;
    @JsonIgnore
    @Column
    private LocalDateTime criado;
    @JsonIgnore
    @Column
    private LocalDateTime atualizado;

    //********** Construtores ***********
    public Aeronave(){}

    public Aeronave(Long id, String nome, String marca, Integer ano, String descricao, boolean vendido, LocalDateTime criado, LocalDateTime atualizado) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.descricao = descricao;
        this.vendido = vendido;
        this.criado = criado;
        this.atualizado = atualizado;
    }

    //********** Getters e Setters ***********
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public LocalDateTime getCriado() {
        return criado;
    }

    public void setCriado(LocalDateTime criado) {
        this.criado = criado;
    }

    public LocalDateTime getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(LocalDateTime atualizado) {
        this.atualizado = atualizado;
    }
}
