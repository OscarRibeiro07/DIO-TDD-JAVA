package br.com.junit.dio;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private LocalDate data;

    public Pessoa(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public int getIdade(){return (int) ChronoUnit.YEARS.between(this.data,LocalDate.now()); }
}
