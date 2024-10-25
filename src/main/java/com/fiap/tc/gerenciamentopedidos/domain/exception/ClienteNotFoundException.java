package com.fiap.tc.gerenciamentopedidos.domain.exception;

public class ClienteNotFoundException extends RuntimeException {
    public ClienteNotFoundException(String message) {
        super(message);
    }
}