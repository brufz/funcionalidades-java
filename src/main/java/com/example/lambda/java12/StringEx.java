package com.example.lambda.java12;

public class StringEx {
    public static void main(String[] args) {
        String texto = "Olá mundo esse é o java 12";
        //adiciona 4 espaços em branco na frente
        String indent = texto.indent(4);
        System.out.println(indent);

        //remove espaço em branco
        String indent1 = texto.indent(-1);
        System.out.println(indent1);

        String transform = texto.transform(par -> par.toLowerCase());
        System.out.println(transform);
        String transformInvertido = texto.transform(par -> new StringBuilder(par).reverse().toString());
        System.out.println(transformInvertido);
    }
}
