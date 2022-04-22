package com.java.class15;

import java.util.Scanner;

//Write a program to check given number is prime number or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.println("Please enter number: ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }if (count==2){
            System.out.println("Prime");}else {
            System.out.println("Not Prime");

        }

    }
}