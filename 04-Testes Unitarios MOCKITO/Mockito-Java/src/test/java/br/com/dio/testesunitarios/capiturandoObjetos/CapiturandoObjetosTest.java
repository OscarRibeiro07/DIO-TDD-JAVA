package br.com.dio.testesunitarios.capiturandoObjetos;


import br.com.dio.testesunitatios.Email;
import br.com.dio.testesunitatios.Formato;
import br.com.dio.testesunitatios.PlataformaDeEnvio;
import br.com.dio.testesunitatios.ServicoEnvioEmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CapiturandoObjetosTest {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){
        String enderecoEmail = "usuario@gmail.com";
        String mensagem = "Ola mundo teste mensagem";

        boolean ehFormatoHtml= false;

        servico.enviaEmail(enderecoEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataformaDeEnvio).enviaEmail(captor.capture());
        Email emailCapturado = captor.getValue();
        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());

    }

}
