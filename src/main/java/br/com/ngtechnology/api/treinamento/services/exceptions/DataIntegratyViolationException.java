package br.com.ngtechnology.api.treinamento.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException{

    public DataIntegratyViolationException(String message) {

        super(message);
    }
}
