package com.java.class14;

import java.util.Scanner;
//Write a program to print second half of string
public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any statement");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  int i =str.length()/2;
        System.out.println(str.substring(i));}


    }

