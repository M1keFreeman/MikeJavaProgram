package com.java.class15;

import java.util.Scanner;

public class StringPracticeWordCount {
    //write a program to take one String from user and find out number words we have inside the statement

    //Exampole- Hello this is my first java String program
    //outout - 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] parts = str.split(" ");
        System.out.println(parts.length);

    }
}
