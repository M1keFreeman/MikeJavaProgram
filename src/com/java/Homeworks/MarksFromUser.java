package com.java.Homeworks;

import java.util.Scanner;

//========= Homework ============
//Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
//If marks are from 90 to 100 Print A
//If marks are from 80 to 89 Print B
//If marks are from 70 to 79 Print C
//If marks are from 60 to 69 Print D
//If marks are from 50 to 59 Print E
//If marks are from 0 to 49 Print Fail
public class MarksFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Mark number from 50 to 100");
        int num = sc.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println(" Print A");
        } else if (num >= 80 && num <= 89 ) {
            System.out.println("Print B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("Print C");
        } else if (num >=60 && num <= 69) {
            System.out.println("Print D");
        } else if (num >= 50 && num <= 59 ) {
            System.out.println("Print E");
        } else if (num >= 0 && num <= 49) {
            System.out.println("Print Fail");

        }
    }
}