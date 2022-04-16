package com.java.Homeworks;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        //  Write a program to check given character is Vowel or Not
        //   Vowel characters are - 'a','e','i','o','u'
        //   (If you're not using scanner class it's fine you can directly take char value in program)
        Scanner sc = new Scanner(System.in);
        String vowel = sc.nextLine();
        switch (vowel) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("This is a Vowel");
                break;
        }
        System.out.println("This is not Vowel");


        }
    }

