package com.example.lambda.exercicios;

import java.util.stream.LongStream;

public class FP05Parallelizing {
    public static void main(String[] args) {
        Long time2 = System.currentTimeMillis();
        System.out.println(LongStream.range(0,100000000).sum());
        System.out.println(System.currentTimeMillis() - time2); //251ms


        Long time = System.currentTimeMillis();
        System.out.println(LongStream.range(0,100000000).parallel().sum());
        //informa que as operações podem ser realizadas em paralelo, aproveitando os recursos de processamento
        //disponiveis em sistemas multi-core. Isso pode resultar em melhoria on desempenho
        System.out.println(System.currentTimeMillis() - time); //29ms



    }

}
