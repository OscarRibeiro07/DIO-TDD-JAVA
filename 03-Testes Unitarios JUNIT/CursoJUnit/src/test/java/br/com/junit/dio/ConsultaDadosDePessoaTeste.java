package br.com.junit.dio;

import org.junit.jupiter.api.*;


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
        ;
    }


    // metodo que é executado depois de tudo
    @AfterAll
    static void FinalizaConexao(){
        BancoDeDados.finaliazConexao();
        System.out.println("Finalizou a conexão do banco");
    }



}
