package com.java.Homeworks;

import java.util.Scanner;
//2. Write a program to print numbers that are divisible by 3 and 5 from 1 to 50
//3. Write a program to print numbers that are not divislbe by 3 and divisible by 7 (edited)
public class Homework05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int i =3;
        while (i <= 50) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);

            i++;
        }
        }
    }
