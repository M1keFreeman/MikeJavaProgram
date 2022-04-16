package com.java.Homeworks;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String reverce = "";
        System.out.println("Enter the name to check ");
        name = sc.nextLine().toLowerCase();
        int length = name.length()-1;
        for (int i =length;i>=0;i--)
            reverce+=name.charAt(i);
            if (name.equals(reverce)){
                System.err.println("Yuy this "+name+" is a Palindrome ");}
            else {
                System.err.println("Sorry "+name+" is not a Palindrome");}



    }
}
