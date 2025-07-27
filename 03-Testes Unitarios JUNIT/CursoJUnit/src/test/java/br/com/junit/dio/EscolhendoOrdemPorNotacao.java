package br.com.junit.dio;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemPorNotacao {

        // Mapeando pelo display


    @Test
    @DisplayName("A")
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("D")
    void validaFluxoA(){
        Assertions.assertTrue(true);

    }
    @Test
    @DisplayName("B")
    void validaFluxoB(){
        Assertions.assertTrue(true);

    }
    @Test
    @DisplayName("C")
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }

}
