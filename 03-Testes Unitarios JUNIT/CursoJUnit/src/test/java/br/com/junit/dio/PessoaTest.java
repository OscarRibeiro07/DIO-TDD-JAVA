package br.com.junit.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void ValidarCAlculoDeIdade(){
        Pessoa p1 = new Pessoa("Julia", LocalDate.of(2020,10,07));
        Assertions.assertEquals(4, p1.getIdade());

    }
}
