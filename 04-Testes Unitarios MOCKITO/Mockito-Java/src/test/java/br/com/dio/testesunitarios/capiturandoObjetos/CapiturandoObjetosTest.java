package br.com.dio.testesunitarios.capiturandoObjetos;

import br.com.dio.testesunitatios.controller.EnviarMensagem;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Captor;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CapiturandoObjetosTest {

    @Captor
    private EnviarMensagem mensagem;

}
