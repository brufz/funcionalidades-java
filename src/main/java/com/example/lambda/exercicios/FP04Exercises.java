package com.example.lambda.exercicios;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FP04Exercises {
    public static void main(String[] args) {
        System.out.println("Creating Streams for firsts 100 numbers, squares and more");

        IntStream rangeOneToTen = IntStream.range(1, 10);
        System.out.println(rangeOneToTen); //java.util.stream.IntPipeline$Head@7cc355be
        System.out.println(rangeOneToTen.count()); // 9
        IntStream rangeOneToTen2 = IntStream.range(1, 10);
        System.out.println(getSum(rangeOneToTen2)); //45

        IntStream rangeClosedOneToTen = IntStream.rangeClosed(1, 10);
        System.out.println(rangeClosedOneToTen);
        System.out.println(rangeClosedOneToTen.count()); //10
        IntStream rangeClosedOneToTen2 = IntStream.rangeClosed(1, 10);
        System.out.println(getSum(rangeClosedOneToTen2)); //55

        IntStream
                .iterate(1, e -> e + 1)
                .limit(100)
                .peek(System.out::println).sum();

        List<Integer> listOfSquares = IntStream
                .iterate(2, e -> e * 2)
                .limit(10)
                .boxed()
                .collect(Collectors.toList()); //[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

        LongStream.rangeClosed(1, 50)
                .mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        //30414093201713378043612608166064768844377641568960512000000000000 = (reduce(1, (a, b) -> a*b))

        //Higher Order Functions

    }


    private static int getSum(IntStream rangeOneToTen) {
        return rangeOneToTen.sum();
    }


}
