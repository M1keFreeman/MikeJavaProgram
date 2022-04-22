package com.java.class15;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name2 = "";
        System.out.println("Enter the name to reverse");
        String name = sc.nextLine();
        int length = name.length() - 1;

        for (int i = length; i >= 0; i--) {
            name2 += name.charAt(i);
            System.err.println(name2);


        }
    }
}