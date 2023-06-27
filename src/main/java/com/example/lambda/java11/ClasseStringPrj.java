package com.example.lambda.java11;

import java.util.stream.Collectors;

public class ClasseStringPrj {
    public static void main(String[] args) {
        String st1 = "";
        String sr2 = "   ";
        String st3 = "Olá\ntudo bem";
        //is blank
        System.out.println(st1.isBlank());
        System.out.println(sr2.isBlank());
        System.out.println(st3.isBlank());

        //lines() elimina as quebras de linha
        System.out.println(st3.lines().collect(Collectors.toList()));

        String st4 = "Ola tudo bem";
        //repeat
        System.out.println(st4.repeat(3));


    }
}
