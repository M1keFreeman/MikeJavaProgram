package com.java.class15;

import java.util.Scanner;

//Write a program to take one String from user and print occurrence of given car in String
public class FindOccuranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text ");
        String text = sc.nextLine();
        char c = 'a';
        int count = 0;

        for (int i =0;i<text.length();i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);



    }
    }


