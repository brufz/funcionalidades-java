package com.example.lambda.exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class FP05Files {
    public static void main(String[] args) throws IOException {
        //arquivo tem que estar na raiz
        Files.lines(Paths.get("file.txt"))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        System.out.println("==========================");

        Files.list(Paths.get("."))
                .filter(Files::isReadable)
                .forEach(System.out::println);

        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
