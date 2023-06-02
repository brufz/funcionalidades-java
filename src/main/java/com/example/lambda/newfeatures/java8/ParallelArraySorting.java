package com.example.lambda.newfeatures.java8;


import java.util.Arrays;

public class ParallelArraySorting{
    public static void main(String[] args) {

        String[] meuArray = {"Varzea", "Jundiai", "Sao Paulo", "ABC"};
        for (String i: meuArray) {
            System.out.println(i + " ");
        }

        Arrays.parallelSort(meuArray);

        for (String i: meuArray) {
            System.out.println(i + " ");
        }

    }
}
