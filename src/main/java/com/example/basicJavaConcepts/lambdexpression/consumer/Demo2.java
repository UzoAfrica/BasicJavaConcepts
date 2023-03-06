package com.example.basicJavaConcepts.lambdexpression.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String ename;
    int salary;
    String gender;

    public Employee(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList= new ArrayList<Employee>();

        empList.add(new Employee("David", 50000, "Male"));
        empList.add(new Employee("Pius", 30000, "Male"));
        empList.add(new Employee("Salah", 20000, "Female"));
        empList.add(new Employee("Nunez", 60000, "Male"));

        //Function
        Function<Employee, Integer> f=emp->emp.salary*10/100;

        //Predicate
        Predicate<Integer> p= b->b>=5000;

        //Consumer
        Consumer<Employee> c= emp->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        for(Employee e:empList)
        {
            int bonus= f.apply(e); // calculate bonus  invoke function

            if(p.test(bonus))   //invoke predicate
            {
                c.accept(e); //invoke consumer
                System.out.println("Employee bonus: " + bonus);
            }
        }

    }

}
