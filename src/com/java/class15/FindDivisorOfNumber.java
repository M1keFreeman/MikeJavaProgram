package com.java.class15;

import java.util.Scanner;

public class FindDivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to Division :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.err.println("Divisible by: " + i);
            }else {
                System.out.println("Not Divisible by: "+i );}
        }
    }
}
