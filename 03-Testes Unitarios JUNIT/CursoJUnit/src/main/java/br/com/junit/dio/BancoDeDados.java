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

    // DEFININDO OUTROS TESTES

    public static void insereDados(Pessoa p){
        // insere pessoa no BD
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa p){
        // remove pessoa no BD
        LOGGER.info("Removeu dados");
    }
}
