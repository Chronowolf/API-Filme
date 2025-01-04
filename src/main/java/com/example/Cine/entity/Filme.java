package com.example.Cine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int ano;
    private  String nome;
    private int classificacao;

    public Filme(int ano, String nome,int classificacao,Integer id){
       this.ano = ano;
       this.nome = nome;
       this.classificacao = classificacao;
       this.id = id;
    }
    public Filme(){

    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", ano=" + ano +
                ", nome='" + nome + '\'' +
                ", classificacao=" + classificacao +
                '}';
    }
}
