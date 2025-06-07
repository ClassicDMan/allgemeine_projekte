package com.hyand.learning.artikel_server.exceptions;

public class ArtikelNotFoundException extends RuntimeException {

    public ArtikelNotFoundException(String message) {
        super(message);
    }
}
