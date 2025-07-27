package br.com.junit.dio;

import java.util.logging.Logger;

public class BancoDeDados {

    static final Logger LOGGER= Logger.getLogger((BancoDeDados.class.getName()));
    public static void iniciarConexao(){
    LOGGER.info("Iniciou conexão");
    }

    public static void finaliazConexao(){
        LOGGER.info("finalizou conexão");
    }
}
