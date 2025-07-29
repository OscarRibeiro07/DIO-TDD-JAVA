package br.com.dio.testesunitarios.ContaTeste;

import br.com.dio.testesunitatios.domain.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1500);

    @Test
    void validarOrdemDeChamada(){

        conta.pagaBoleto(300);
        // valida se os metodos estão sendo chamdos nesta ordem caso nao
        // é retonado erro de verificação de ordem informando que esta fora do padrão
        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeChamada(){

        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);
        // conta quantas vezes o metodo foi chamado 
        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());

    }
}
