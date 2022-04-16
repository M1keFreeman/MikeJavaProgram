package com.java.class14;

import java.util.Scanner;

public class PrintReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String str = sc.nextLine();
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev += str.charAt(i);
        }
        System.out.println(strRev);
    }
}