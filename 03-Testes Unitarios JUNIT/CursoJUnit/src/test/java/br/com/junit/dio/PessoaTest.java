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

    @Test
    void validaMaiorIdade(){
        Pessoa p2 = new Pessoa("Rafael ", LocalDate.of(2000,10,07));
        Assertions.assertTrue(p2.maiorIdade());
    }

    @Test // -> Define que é um teste
    void validaMultiplosIdadeAtualMaiorIdade(){
        Pessoa p3 = new Pessoa("Rafael ", LocalDate.of(2000,10,07)); //--> cenario de teste
        Assertions.assertTrue(p3.maiorIdade()); // --> executando validções

        Pessoa p4 = new Pessoa("Rafael ", LocalDate.now());
        Assertions.assertFalse(p4.maiorIdade());

    }
}
