package com.java.class06;

import java.util.Scanner;

public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your Weight");
        int weight=sc.nextInt();

        if (age<18) {
            if (weight >= 50) {
                System.out.println("You're eligible");
            } else {
                System.out.println("you're under wight");
            }
        }else{
            if (weight>50) {
                System.out.println("Your are to young");
            }else {
                System.out.println("You're totally not eligible");
        }

    }
}}

