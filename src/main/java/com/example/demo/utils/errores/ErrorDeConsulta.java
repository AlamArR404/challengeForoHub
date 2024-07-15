package com.example.demo.utils.errores;

public class ErrorDeConsulta extends RuntimeException {
    public ErrorDeConsulta(String string) {
        super(string);
    }
}