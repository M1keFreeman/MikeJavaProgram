package com.java.Homeworks;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word what you want it to check : ");
        String word = sc.nextLine();

        System.out.println(Palindrome(word));


    }

    public static String Palindrome(String word) {
        String rev = "";
        int length =word.length()-1;


        for (int i = length; i >=0; i--)
            rev += word.charAt(i);

            if (rev.equals(word)) {
                System.out.println("This word : "+ word+" is "+ "Palindrome :");
            } else {
                System.out.println("Not a Palindrome ");
            }

        return rev;
    }

}
