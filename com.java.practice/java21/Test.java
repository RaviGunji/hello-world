package com.java.practice.java21;

import java.util.Arrays;

import static java.util.Calendar.*;

public class Test {
    public static void main(String[] args) {
        String name="Ravi";
        var empList= Arrays.asList("Ravi","Siva");
        System.out.println(empList);
        System.out.println(switch(FRIDAY) {
                    case SATURDAY, SUNDAY -> "Weekend";
                    default -> "Regular Day";
                }
        );
        String day=switch (2){
            case WEDNESDAY -> "Matched Day";
            case 2 -> "Number Found";
            default -> "Not Matched";
        };
        System.out.println(day);
    }
}
