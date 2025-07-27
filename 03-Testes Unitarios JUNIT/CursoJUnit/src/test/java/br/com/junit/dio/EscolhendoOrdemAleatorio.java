package br.com.junit.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoOrdemAleatorio {

        // Aleatorio


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
