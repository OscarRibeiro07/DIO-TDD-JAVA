package br.com.junit.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTeste {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER",matches = "Oscar")
    void validarAlgoSomenteNoUsuarioOscar(){
        Assertions.assertEquals(13,5+8);
    }
    @Test
    @DisabledIfEnvironmentVariable(named = "Oscar-Ribeiro",matches = "ROOT")
    void validarAlgoSomenteNoUsuarioOscar2(){
        Assertions.assertEquals(13,5+8);
    }

    // habilitar so linux
    @Test
    @EnabledOnOs(OS.LINUX)
    void sistemaOperacionalLinuxOpen(){
        Assertions.assertEquals(13,5+8);
    }
    @Test
    @DisabledOnOs(OS.LINUX)
    void sistemaOperacionalLinuxCloser(){
        Assertions.assertEquals(13,5+8);
    }
    @Test
    @DisabledOnOs({OS.LINUX,OS.MAC})
    void variosSistemaOperacionalinuxMAc(){
        Assertions.assertEquals(13,5+8);
    }
    @Test
    @DisabledOnJre(JAVA_11)
    void versaoExpecificaJAva11(){
        Assertions.assertEquals(13,5+8);
    }
    @Test
    @DisabledOnJre(JAVA_17)
    void versaoExpecificaJAva17(){
        Assertions.assertEquals(13,5+8);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_21)
    void maximoDeVersao(){
        Assertions.assertEquals(13,5+8);
    }
}
