package com.java.class11;

import java.util.Scanner;

//1 2 * 4 5 *7 8 *10
public class InClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;
        while (i <= limit) {
            if (i % 3 == 0) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }
                i++;
            }
        }
    }

