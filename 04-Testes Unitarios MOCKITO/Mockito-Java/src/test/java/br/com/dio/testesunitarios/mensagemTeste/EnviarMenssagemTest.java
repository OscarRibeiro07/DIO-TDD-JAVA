package br.com.dio.testesunitarios.mensagemTeste;

import br.com.dio.testesunitatios.controller.EnviarMensagem;
import br.com.dio.testesunitatios.domain.Mensagem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMenssagemTest {

    @Spy
    private EnviarMensagem enviarMensagem;


    @Test
    void verificaComportamentoDaClasse(){
        // verifica movimento de msg
        Mockito.verifyNoInteractions(enviarMensagem);

        //PAssa uma mensagem
        Mensagem msg = new Mensagem(("Bom dia Pessoal"));
        // Passa mensagem no metodo que adiciona msg
        enviarMensagem.adicionarMensagem(msg);
        //Verifica se foi chamado o metodo adc mensagem da classe enviar
        Mockito.verify(enviarMensagem).adicionarMensagem(msg);
    }
}
