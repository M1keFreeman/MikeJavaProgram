package com.java.Homeworks;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Please enter hove many numbers you want it");
        int num = sc.nextInt();

        while (i <= num) {
            System.out.println(i * 3);

            i++;
        }
    }
}