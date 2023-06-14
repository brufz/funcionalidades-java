package com.example.lambda.interfaceAnonima;

public class SomaTudoExemplo {

    public static void main(String[] args) {
        SomaTudo<String> somaString = new SomaTudo<>() {
            @Override
            public String somaTudo(String a, String b) {
                return a + b;
            }
        };

        System.out.println(somaString.somaTudo("Ola", " mundo"));
    }
}
