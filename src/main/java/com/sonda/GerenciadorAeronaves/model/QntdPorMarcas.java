package com.sonda.GerenciadorAeronaves.model;

public class QntdPorMarcas {
    private String nome;
    private Long qntd;

    public QntdPorMarcas(String nome, Long qntd) {
        this.nome = nome;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getQntd() {
        return qntd;
    }

    public void setQntd(Long qntd) {
        this.qntd = qntd;
    }
}
