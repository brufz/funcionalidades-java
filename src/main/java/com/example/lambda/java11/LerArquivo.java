package com.example.lambda.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            String conteudo = Files.readString(Path.of("meutexto3.txt"));
            System.out.println(conteudo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
