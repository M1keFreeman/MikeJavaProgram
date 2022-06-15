package com.java.Homeworks;

import java.util.Locale;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {

    Palindrome pal = new Palindrome();
    pal.newPalindrome();


    }
    public void newPalindrome() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (reverse.equals(word)) {

            System.out.println(reverse + " is Palindrome ");

        } else {
            System.err.println(reverse + " is not Palindrome");

        }

    }
}
