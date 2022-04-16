package com.java.Homeworks;

import java.util.Scanner;

public class TShirtSizes {
    public static void main(String[] args) {
        //2.  Write a program to get T-shirt size in inches and print size based on inches
        //If inches is 27 to 30 Print XS
        //If inches is 31 to 34 Print S
        //If inches is 35 to 38 Print L
        //If inches is 39 to 42 Print XL
        //If inches is 45 to 50 Print XXL
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size >= 27 && size <= 30) {
            System.out.println("Your size is XS");
        } else if (size >= 31 && size <= 34) {
            System.out.println("Your size is S");
        } else if (size >= 35 && size <= 38) {
            System.out.println("Your size is L");
        } else if (size >= 39 && size <= 42) {
            System.out.println("Your size is XL");
        } else if (size >= 45 && size <= 50) {
            System.out.println("Your size is XXL");
        }
    }
}
