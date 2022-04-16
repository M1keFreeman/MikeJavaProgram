package com.java.Homeworks;

import java.util.Scanner;

//3. Write a program to take number from user and check if it's divisible by 5 or 3
public class HomeWorkDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int num = sc.nextInt();
        if (num % 5 == 0 || num % 3 == 0)
            System.out.println(num + " Is Divisible");
        else {
            System.out.println(num + " Is Not Divisible");
        }
    }
    }
