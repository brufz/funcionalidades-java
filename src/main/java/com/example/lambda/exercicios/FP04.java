package com.example.lambda.exercicios;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FP04 {
    static class Course {
        private String name;
        private String category;
        private int reviewScore;
        private int noOfStudents;

        public Course(String name, String category, int reviewScore, int noOfStudents) {
            this.name = name;
            this.category = category;
            this.reviewScore = reviewScore;
            this.noOfStudents = noOfStudents;
        }

        @Override
        public String toString() {
            return name = ":" + noOfStudents + ":" + reviewScore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getReviewScore() {
            return reviewScore;
        }

        public void setReviewScore(int reviewScore) {
            this.reviewScore = reviewScore;
        }

        public int getNoOfStudents() {
            return noOfStudents;
        }

        public void setNoOfStudents(int noOfStudents) {
            this.noOfStudents = noOfStudents;
        }
    }

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 96, 10000),
                new Course("Microservices", "Framework", 98, 25000),
                new Course("AWS", "Cloud", 90, 350),
                new Course("Azure", "Cloud", 98, 10000),
                new Course("Docker", "Cloud", 92, 20000)
        );

        boolean b = courses.stream().allMatch(course -> course.getReviewScore() > 90);
        System.out.println("All courses match with score greater then 90? " + b);

        boolean b1 = courses.stream().anyMatch(course -> course.getReviewScore() > 90);
        System.out.println("Any course match with score greater then 90? " + b1);

        boolean b2 = courses.stream().noneMatch(c -> c.getNoOfStudents() == 20005);
        System.out.println("None course match with 20005 students? " + b2);

        boolean b3 = courses.stream().anyMatch(c -> c.getNoOfStudents() < 5000);
        System.out.println("Any course match with greater than 5000 students? " + b3);

        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparingByNoOfStudentsReversed = Comparator.comparing(Course::getNoOfStudents).reversed();
        List<Course> collect = courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList());
        List<Course> collectDecreasing = courses.stream().sorted(comparingByNoOfStudentsReversed).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collectDecreasing);

        Comparator<Course> comparingTwoItens = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
        List<Course> collectTwoItens = courses.stream().sorted(comparingTwoItens).collect(Collectors.toList());
        System.out.println(collectTwoItens);

        Comparator<Course> comparingNames = Comparator.comparing(Course::getName);
        List<Course> collect1 = courses.stream().sorted(comparingNames).collect(Collectors.toList());
        System.out.println(collect1);

        //limit
        List<Course> collect2 = courses.stream().sorted(comparingTwoItens).limit(3).collect(Collectors.toList());
        System.out.println(collect2);

        List<Course> collect3 = courses.stream().sorted(comparingTwoItens).skip(2).limit(1).collect(Collectors.toList());
        System.out.println(collect3);

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        //max - min -> retorna Optional
        System.out.println("=== MAX ===");
        Optional<Integer> max = numeros.stream().max(Comparator.comparingInt(Integer::intValue));
        System.out.println(max);

        System.out.println("=== MIN ===");
        Optional<Course> min = courses.stream().min(comparingTwoItens);
        System.out.println(min);

        System.out.println("EMPTY OPTIONAL");
        System.out.println(courses.stream().filter(c -> c.getReviewScore() < 80).min(comparingTwoItens));

        System.out.println("EMPTY OPTIONAL -> OR ELSE");
        System.out.println(courses.stream().filter(c -> c.getReviewScore() < 80)
                .min(comparingTwoItens)
                .orElse(new Course("Node", "Dev", 70, 1000)));

        //dropWhile
        System.out.println("DROPWHILE");
        System.out.println(courses.stream().dropWhile(condition -> condition.getReviewScore() < 95).collect(Collectors.toList()));

        //takeWhile
        System.out.println("TAKE WHILE");
        System.out.println(courses.stream().takeWhile(condition -> condition.getReviewScore() < 98).collect(Collectors.toList()));
    }
}