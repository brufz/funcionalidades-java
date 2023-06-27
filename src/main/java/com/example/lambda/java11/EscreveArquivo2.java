package com.example.lambda.java11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo2 {
    public static void main(String[] args) {
        String caminho = "meutexto2.txt";
        String meuTexto = "Curso sobre features novas";


        try(var bufferedWriter = new BufferedWriter(new FileWriter(caminho))){
            bufferedWriter.write(meuTexto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
