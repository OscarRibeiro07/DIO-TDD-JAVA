package br.com.junit.dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceprionTeste {
    @Test
    void validaExceptionTransfere(){
        Conta origem = new Conta("Oscar ", 0);
        Conta destino = new Conta("Oscar ", 150);

        TranfereEntreContas tranferenciaDeConta = new TranfereEntreContas();

        Assertions.assertThrows(IllegalAccessError.class, () -> tranferenciaDeConta.transfere(origem,destino,1));
    }
    @Test
    void validaExceptionTransfereEx1(){
        Conta origem = new Conta("Oscar ", 0);
        Conta destino = new Conta("Oscar ", 150);

        TranfereEntreContas tranferenciaDeConta = new TranfereEntreContas();

        Assertions.assertDoesNotThrow(() -> tranferenciaDeConta.transfere(origem,destino,20));
    }
}
