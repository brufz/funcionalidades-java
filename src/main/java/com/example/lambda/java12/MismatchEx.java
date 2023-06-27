package com.example.lambda.java12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchEx {
    public static void main(String[] args) {
        File f1 = new File("texto1.txt");
        File f2 = new File("texto2.txt");

        try {
            long resultado = Files.mismatch(f1.toPath(), f2.toPath());
            //devolve a posição em que o primeiro byte diferente se encontra.
            System.out.println(resultado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
