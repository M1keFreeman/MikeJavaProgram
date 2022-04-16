package com.java.Homeworks;

import java.util.Scanner;

public class RomaExamples {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 10; i=i+2) {
            System.out.println(i);
        }*/
        Scanner sc =new Scanner(System.in);

        String a =sc.nextLine();
        // Roma  => length  4
        // 1234

        //Roma -> indexes
        //0123
        String b = "";

        for (int i = a.length()-1; i >= 0; i--) {
//            b += a.charAt(i);
            b=b + a.charAt(i);

        }  System.out.println(b);
        if (a.equals(b)){
            System.out.println("Is palindrome");}else {
            System.out.println("It is not a Palindrome");}
}
}