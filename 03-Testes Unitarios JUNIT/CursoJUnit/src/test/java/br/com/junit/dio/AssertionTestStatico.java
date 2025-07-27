package br.com.junit.dio;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
// definindo os estatios  AssertEquals
// definindo os estatios  AssertNull
import static org.junit.jupiter.api.Assertions.*;


public class AssertionTestStatico {

    // para não ficar sempre schamando o assertion importar como estatico

    @Test
    void validarLancamento(){
        int[] primeriroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,5,2,10,16};
        // comparando os valores - sempre da erro pois valida campo por campo
        assertArrayEquals(primeriroLancamento, segundoLancamento);
    }
    @Test
    void validarLancamentoIguais(){
        // todos os campos iguais retorna ok
        int[] primeriroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};
        // comparando os valores
        assertArrayEquals(primeriroLancamento, segundoLancamento);
    }

    @Test
    void validarLancamentoAlgunsDiferentes(){
        int[] primeriroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,5,2,10,16};
        // comparando os valores - Como esse metodo assert busca apenas os iguais, test ok pois alguns numeros são iguais
        assertNotEquals(primeriroLancamento, segundoLancamento);
    }

    @Test
    void validaObjetoEstaNull(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa= new Pessoa("Ceano", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validaTiposDiferentesNumeros(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);


    }

}
