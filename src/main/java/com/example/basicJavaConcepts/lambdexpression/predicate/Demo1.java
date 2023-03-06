package com.example.basicJavaConcepts.lambdexpression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeClass {
    String ename;
    int salary;
    int experience;

    public EmployeeClass(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }
}

    public class Demo1 {
        public static void main(String[] args) {
            ArrayList<EmployeeClass> el = new ArrayList<EmployeeClass>();
            el.add(new EmployeeClass("John", 4000, 4));
            el.add(new EmployeeClass("Paul", 5000, 4));
            el.add(new EmployeeClass("Bose", 3000, 6));
            el.add(new EmployeeClass("Desmond", 7000, 2));

            Predicate<EmployeeClass> pr = e -> (e.salary > 3000 && e.experience > 3);

            for (EmployeeClass e : el) {
                if (pr.test(e)) {
                    System.out.println(e.ename + " " + e.salary);
                }
            }
        }
    }


