package com.sonda.GerenciadorAeronaves;

import org.w3c.dom.Text;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity //Anotação utilizada indicar que a Classe é uma Entidade e está sendo Mapeada para o BD
@Table(name="aeronaves") //Mapeamento do BD quer será utilizado

/**
 *
 * @Author Jean Pierre
 * @Date 04/02/2021
 *
 */

public class Aeronave {
    @Id //Anotação para determinar a chave primária
    private Long id;
    @Column //Anotação para indicar as colunas no BD
    private String nome;
    @Column
    private String marca;
    @Column
    private Integer ano;
    @Column
    private Text descricao;
    @Column
    private boolean vendido;
    @Column
    private Date criado;
    @Column
    private Date atualizado;

    //********** Construtor ***********
    public Aeronave(Long id, String nome, String marca, Integer ano, Text descricao, boolean vendido, Date criado, Date atualizado) {
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

    public Text getDescricao() {
        return descricao;
    }

    public void setDescricao(Text descricao) {
        this.descricao = descricao;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public Date getCriado() {
        return criado;
    }

    public void setCriado(Date criado) {
        this.criado = criado;
    }

    public Date getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(Date atualizado) {
        this.atualizado = atualizado;
    }
}
