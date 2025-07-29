package br.com.dio.testesunitarios.manipulandoRetornos;

import br.com.dio.testesunitatios.API.ApiDosCorreios;
import br.com.dio.testesunitatios.domain.DadosLocalizacao;
import br.com.dio.testesunitatios.domain.Pessoa;
import br.com.dio.testesunitatios.services.CadastrarPessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {


    @Mock
    private ApiDosCorreios apiDosCorreios;
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void lancarExceptionQuandoChamarAPIDosCorreios(){

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalAccessException.class);


        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Willian", "1254879635",
                LocalDate.of(2002,10,01), "4444-354");

        Assertions.assertThrows(IllegalAccessException.class, () -> cadastrarPessoa.cadastrarPessoa("Willian", "1254879635",
                LocalDate.of(2002,10,01), "4444-354"));
    }

    @Test
    void lancarExceptionQuandoAPIDosCorreios(){

        Mockito.doThrow(IllegalAccessException.class).when(apiDosCorreios).buscaDadosComBaseNoCep("22454");


        Assertions.assertThrows(IllegalAccessException.class,
                ()-> cadastrarPessoa.cadastrarPessoa("Willian", "1254879635",
                        LocalDate.of(2002,10,01), "22454"));
    }


}
