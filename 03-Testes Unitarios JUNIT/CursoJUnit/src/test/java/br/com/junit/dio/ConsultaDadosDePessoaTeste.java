package br.com.junit.dio;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

    // metodo que é executado depois de tudo
    @AfterAll
    static void FinalizaConexao(){
        BancoDeDados.finaliazConexao();
        System.out.println("Finalizou a conexão do banco");
    }
}
