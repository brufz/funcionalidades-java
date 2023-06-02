package com.example.lambda.newfeatures.java8;

import java.util.StringTokenizer;

public class StringJoiner {
    public static void main(String[] args) {
        String nomes = "Bruna, Marina, Maria Luisa";
        StringTokenizer st = new StringTokenizer(nomes, ",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        java.util.StringJoiner sj = new java.util.StringJoiner(", ");
        sj.add("Joao");
        sj.add("Pedro");
        sj.add("Paulo");

        System.out.println(sj);


    }
}
