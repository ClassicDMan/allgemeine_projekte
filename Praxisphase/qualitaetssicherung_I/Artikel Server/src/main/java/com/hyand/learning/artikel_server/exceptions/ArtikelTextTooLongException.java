package com.hyand.learning.artikel_server.exceptions;

public class ArtikelTextTooLongException extends RuntimeException {
    public ArtikelTextTooLongException(String message) {
        super(message);
    }
}
