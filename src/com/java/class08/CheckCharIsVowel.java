package com.java.class08;

import java.util.Locale;
import java.util.Scanner;

public class CheckCharIsVowel {
    public static void main(String[] args) {
        //take single char in the program and check weather given char is vowel or not
        //Vowel char are - a, e , i ,o , u
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toLowerCase().charAt(0);

        if(c == 'a' || c== 'e' || c=='i'|| c=='o' || c=='u') { System.out.println("it is Vowel");}
        else {
            System.out.println("This is not a Vowel");



        }
    }
}















