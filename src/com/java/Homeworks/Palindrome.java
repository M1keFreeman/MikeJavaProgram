package com.java.Homeworks;

import java.util.Locale;
import java.util.Scanner;

//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str, rev = "";
//        System.out.println("Enter the word/number to fin is it a palindrome or not ");
//        str = sc.nextLine();
//        int length = str.length();
//        for (int i =length - 1; i >= 0; i--)
//            rev = rev + str.charAt(i);
//        if (str.equals(rev)) {
//            System.out.println(str + " is palindrome");
//        } else System.out.println(str + " non-palindrome");
//
//    }
//}
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String rev = "";
        System.out.println("Enter the word/number to find is it a palindrome or not ");
       str = sc.nextLine().toLowerCase();
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--)
//            rev = rev + str.charAt(i);
            rev += str.charAt(i);

        if (str.equals(rev)) {
            System.out.println(str + " is palindrome");
        } else System.out.println(str + " non-palindrome");

    }
}
