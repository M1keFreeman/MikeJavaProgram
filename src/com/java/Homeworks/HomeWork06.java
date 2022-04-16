package com.java.Homeworks;

import java.util.Scanner;

//3. Write a program to print numbers that are not divislbe by 3 and divisible by 7 (edited)
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int i = 1;
        while (i <= 50) {
            if (i % 3 != 0 && i % 7 == 0)
                System.out.println(i);
            i++;
        }
    }
}