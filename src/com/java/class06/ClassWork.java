package com.java.class06;

import java.util.Scanner;

public class ClassWork {
    //Write a program to check given number is positive/negative or zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("This is positive number");
        } else if (num <= 0) {
            System.out.println("this is negative number");
        } else if (num == 0) {
            System.out.println("This is a Zero");
        }

    }
}
