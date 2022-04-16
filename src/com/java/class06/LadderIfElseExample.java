package com.java.class06;

import java.util.Scanner;

//write a program when user enter any number from +to 6
//print days of week
//0 - Sunday,1- Monday,2-Tue,.....6- Sat.
public class LadderIfElseExample {
    public static void main(String[] args) {
        //Input
        System.out.println("enter any number from 0 to 6");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        if (dayNum == 0) {
            System.out.println("Sun");
        } else if (dayNum == 1) {
            System.out.println("Mon");
        } else if (dayNum == 2) {
            System.out.println("Tue");
        } else if (dayNum == 3) {
            System.out.println("Wed");
        } else if (dayNum == 4) {
            System.out.println("Thur");
        } else if (dayNum == 5) {
            System.out.println("Frid");
        } else if (dayNum == 6) {
            System.out.println("Sat");
        } else {
            System.out.println("Please enter form 0 to 6 only");


              //Outputs
//            System.out.println("Sunday");
//            System.out.println("Monday");
//            System.out.println("Tuesday");
//            System.out.println("Wednesday");
//            System.out.println("Thursday");
//            System.out.println("Friday");
//            System.out.println("Saturday");

        }

    }
}
