package com.java.class06;

import java.util.Scanner;

public class Classwork02 {
    public static void main(String[] args) {
        System.out.println("Enter a number 1 to 12");
        //Write a program to take month from user and print number  of days in given month
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month == 1) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28-29 days");
        } else if (month == 3) {
            System.out.println("31");
        } else if (month == 4) {
            System.out.println("30");
        } else if (month == 5) {
            System.out.println("31");
        } else if (month == 6) {
            System.out.println("30");
        } else if (month == 7) {
            System.out.println("31");
        } else if (month == 8) {
            System.out.println("31");
        } else if (month == 9) {
            System.out.println("30");
        } else if (month == 10) {
            System.out.println("31");
        } else if (month == 11) {
            System.out.println("30");
        } else if (month == 12) {
            System.out.println("31");
        }
        System.out.println("Please enter month from 1 to 12");


    }

}