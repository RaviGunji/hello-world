package com.java.practice.java21;

public class InstanceOfTest {
    public static void main(String[] args) {
        process("Ravi");
        processOld("Old instance of ");
    }
    static void process(Object obj){
        if(obj instanceof String s)
        System.out.println("Greeting "+s);
    }

    static void processOld(Object obj){
        if(obj instanceof String){
            String s=(String)obj;
            System.out.println("Greeting "+s);
        }

    }
}
