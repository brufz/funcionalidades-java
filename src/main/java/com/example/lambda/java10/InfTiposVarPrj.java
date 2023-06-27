package com.example.lambda.java10;

import java.util.List;

public class InfTiposVarPrj {
    public static void main(String[] args) {
        var numero = 1;
        var nome = "Bruna";

        System.out.println(numero + nome);

        var lista = List.of("Banana", "Pera", "Melancia");
        for (var fruta:lista) {
            System.out.println(fruta);
        }

        for (var i = 0; i > lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
