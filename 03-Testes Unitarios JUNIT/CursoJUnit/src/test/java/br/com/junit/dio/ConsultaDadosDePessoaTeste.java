package br.com.junit.dio;

import org.junit.jupiter.api.*;

import java.time.LocalDate;


public class ConsultaDadosDePessoaTeste {

    // metodo que é executado antes de tudo
    @BeforeAll
    static void ConfiguraConexap(){
        BancoDeDados.iniciarConexao();
        System.out.println("Iniciou a conexão com banco");

    }

    @Test
    void validarDAdosRetorno(){
        Assertions.assertTrue(true);
    }


    @BeforeEach
    void insereDadosParaTestes(){
        BancoDeDados.insereDados(new Pessoa("Maicon", LocalDate.of(2023,01,23)));
    }

    @AfterEach
    void removeDados(){
        BancoDeDados.removeDados(new Pessoa("Maicon", LocalDate.of(2023,01,23)));
    }

    // metodo que é executado depois de tudo
    @AfterAll
    static void FinalizaConexao(){
        BancoDeDados.finaliazConexao();
        System.out.println("Finalizou a conexão do banco");
    }



}
