package br.com.dio.testesunitarios.pessoaTeste;

import br.com.dio.testesunitatios.API.ApiDosCorreios;
import br.com.dio.testesunitatios.domain.DadosLocalizacao;
import br.com.dio.testesunitatios.domain.Pessoa;
import br.com.dio.testesunitatios.services.CadastrarPessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {


    @Mock
    private ApiDosCorreios apiDosCorreios;
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de minas", "Rua 02", "APTo", "CEntro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("4444-354")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Willian", "1254879635",
                LocalDate.of(2002,10,01), "4444-354");

        assertEquals("Willian", pessoa.getNome() );
        assertEquals("1254879635", pessoa.getDocumento() );
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("APTo", pessoa.getEndereco().getComplemento());
    }


}
