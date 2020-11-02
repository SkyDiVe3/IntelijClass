package com.step.wrapperClass;

import java.util.Scanner;

public class Example {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        checkDay(day);

    }
    public static void checkDay(String day){
        DaysOfWeek daysOfWeek=DaysOfWeek.valueOf(day);
        switch (daysOfWeek){
            case MONDAY:

        }
    }

}
