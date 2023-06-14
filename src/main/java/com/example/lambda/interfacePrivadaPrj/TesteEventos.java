package com.example.lambda.interfacePrivadaPrj;

public class TesteEventos implements LogEventosI {
    public static void main(String[] args) {
        LogEventosI log = new LogEventosI() {
        };
        log.logError("Conexão falhou");
    }
}
