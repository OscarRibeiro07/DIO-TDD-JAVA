package br.com.junit.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNoUsuarioOscar(){
        Assumptions.assumeTrue("root".equals((System.getenv("USER"))));
        Assertions.assertEquals(13,5+8);
    }

}
