package com.example.lambda.java11;

import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
    public static void main(String[] args) {
        String caminho = "meutexto.txt";
        String meuTexto = "Curso sobre features novas";

        try(var fileWriter = new FileWriter(caminho)){
            fileWriter.write(meuTexto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
