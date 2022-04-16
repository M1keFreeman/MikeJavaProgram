package com.java.class07;

import java.util.Scanner;

public class LadderIfElseWithLogicalOperatorAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take one number (Marks) from user (keyboard)
        //90 to 100 then print Grade A
        //80 to 89 then print Grade B
        //70 to 79 then print Grade C
        //60 to 69 then print Grade D
        //50 to 59 then print Grade E
        //0 to 49 then print Grade F
        System.out.println("Print numbers from 50 to 100");
        int num = sc.nextInt();

        if (num >= +90) {
            System.out.println("Grade A");
        } else if (num >= +80) {
            System.out.println("Grade B");
        } else if (num >= +70) {
            System.out.println("Grade C");
        } else if (num >= +60) {
            System.out.println("Grade D");
        } else if (num >= +50) {
            System.out.println("Grade E");
        } else if (num >= +0) {
            System.out.println("Grade F");
        }

    }
}



