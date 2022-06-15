package com.java.RomasClass;

import java.util.Scanner;

//Pali or NOt
public class TimClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String rev = "";
        System.out.println("Enter the name to check ");
        name = sc.nextLine();
        int length = name.length() - 1;

        for (int i = length; i >= 0; i--)
            rev = rev + name.charAt(i);
        if (name.equals(rev)) {
            System.out.println("This name " + name + " is Palindrome");
        } else {
            System.out.println("this name " + name + " is nor Palindrome");
        }

    }
}
