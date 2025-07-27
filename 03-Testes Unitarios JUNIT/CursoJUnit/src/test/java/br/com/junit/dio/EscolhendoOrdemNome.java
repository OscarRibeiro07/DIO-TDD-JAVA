package br.com.junit.dio;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoOrdemNome {

        // ordenado a execucao pelo nome do metodo


    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);

    }
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);

    }
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }

}
