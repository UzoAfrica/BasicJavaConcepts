package com.example.basicJavaConcepts.lambdexpression.functions;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("David", 50000));
        empList.add(new Employee("John", 14000));
        empList.add(new Employee("Mary", 30000));
        empList.add(new Employee("Joy", 10000));

        Function<Employee, Integer> fn= e-> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return (sal * 10 / 100);
            else if (sal >= 20000 && sal <= 30000)
                return (sal * 20 / 100);
            else if (sal >= 30000 && sal <= 50000)
                return (sal * 30 / 100);
            else
                return (sal*40/100);
        };

        Predicate<Integer> p= b->b>5000;  //Predicate
        for(Employee emp:empList)
        {

            int bonus= fn.apply(emp);  //Function
            if(p.test(bonus)) {
                System.out.println(emp.ename + " " + emp.salary);
                System.out.println("Bonus is : " + bonus);
            }
        }
    }
}
