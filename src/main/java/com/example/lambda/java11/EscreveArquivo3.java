package com.example.lambda.java11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class EscreveArquivo3 {
    public static void main(String[] args) {
        //funcionalidade do java 11
        String caminho = "meutexto3.txt";
        String meuTexto = "Curso sobre features novas testando acentos: é á !";

        try {
            Files.writeString(new File(caminho).toPath(), meuTexto, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
