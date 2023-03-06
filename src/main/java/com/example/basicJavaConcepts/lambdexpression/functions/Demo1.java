package com.example.basicJavaConcepts.lambdexpression.functions;

import java.util.function.Function;

public class Demo1  {
    public static void main(String[] args) {
        Function<Integer, Integer> f=n -> n*n;

        System.out.println(f.apply(5));
        System.out.println(f.apply(533));
        System.out.println(f.apply(25));

        Function<String, Integer> p=n->n.length();
        System.out.println(p.apply("James"));
        System.out.println(p.apply("Welcome to Java   "));
    }
}
