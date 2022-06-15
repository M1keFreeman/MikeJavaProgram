package com.java.class26;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //================Trim===============================
        String str1 = "    Hello! Welcome to Ebay";
        String str2 = "Hello! Welcome to Ebay";
        System.out.println(str1.trim());
        System.out.println(str1.trim().equals(str2));

        //================Format===============================
        String str3 = "Welcome to %s classes, %s will guide you";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite programming lanquich ");
        String pl = sc.nextLine();

        System.out.println("Enter you fav mentor - ");
        String mentor = sc.nextLine();

        System.out.println(String.format(str3, pl, mentor));
        //================SPLIT===============================
        String str4 = "This is my statement of Split";
        String[] words = str4.split(" ");
        for (String word : words) {
            System.out.println(word);

        } //================isEmpty,isBlank===============================

        String str5 = "    ";
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());

//================Sub-String===============================
                //unhappy.substring(2) return happy
                //Harbison.substring(3) return bison
                //emptiness.substring(9) return ""(an empty string)
        String str6 = "This is java classes";
        System.out.println(str6.substring(5,9));

                // "humburger".substring(4,8) return "urge"
                // "smiles".substring(1,5) return "mile"
    }
}
