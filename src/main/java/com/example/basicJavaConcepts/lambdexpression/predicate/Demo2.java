package com.example.basicJavaConcepts.lambdexpression.predicate;

import java.util.function.Predicate;

// AND, OR,

public class Demo2 {
    public static void main(String[] args) {
        int a[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};

        Predicate<Integer> p1= i-> i%2==0;
        Predicate<Integer> p2= i-> i>40;

//        for(int n:a){
////            if(p1.test(n) && p2.test(n))
//            if(p1.and(p2).test(n))
//
//            {
//                System.out.println(n);
//            }
//        }

       /* for(int n:a){
//            if(p1.test(n) && p2.test(n))
            if(p1.or(p2).test(n))

            {
                System.out.println(n);
            }
        }*/
        for(int n:a){
//            if(p1.test(n) && p2.test(n))
            if(p1.negate().test(n))

            {
                System.out.println(n);
            }
        }
    }
}
