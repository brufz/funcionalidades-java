package com.example.lambda.java11;

import java.util.List;
import java.util.function.Function;

public class VarLambda {
    public static void main(String[] args) {
        //antes
        Function<String, String> concatena = (String s) -> s + ". ";
        //depois
        Function<String, String> concatena2 = (var s) -> s + ". ";
    }
}
