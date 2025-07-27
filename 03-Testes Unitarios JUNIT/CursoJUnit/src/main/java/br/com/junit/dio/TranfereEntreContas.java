package br.com.junit.dio;

public class TranfereEntreContas {

    public void transfere( Conta origem, Conta destiono, int valor) throws IllegalAccessException {
        if(valor<=0) {
            throw  new IllegalAccessException("Valor deve ser maior que zero");
        }
    }
}
