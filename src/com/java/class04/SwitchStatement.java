package com.java.class04;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        //Switch statement takes the variable what ever this condition is test!
        //Break will not text next statement
        //Default- it another statement -->it will text when we put another number what we don't have in statement
        //we need a break after default, if we want to put another statements.
        switch (num) {
            case 100 :
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Please Enter from 0 to 9");


        }
    }
}
