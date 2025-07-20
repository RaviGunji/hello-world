package com.java.practice.java21;

import java.io.Serializable;
import java.util.Arrays;

public class RecordDemo {
    public static void main(String[] args) {
    Employee e1=new Employee("Ravi",40);
        Employee e2=new Employee();
        e2.test();
        var empList= Arrays.asList(e1,e2);
        System.out.println(empList);
    }
}
record Employee(String name,int age)  {
    public Employee(){
        this("Vijay",12);
    };
    public void test(){
        System.out.println("Test of Employee!");
    }
};
