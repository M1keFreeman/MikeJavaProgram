package com.java.class16;

import java.util.Scanner;

public class MethodExample {
    static void printLine(int length,char c ) {

        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printLine(30,'=');
        System.out.println("Please enter first number: ");
        printLine(30,'=');
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printLine(50,'*');
        System.out.println("Please enter second number: ");
        printLine(100,'*');
        int b = sc.nextInt();

        printLine(50,'~');
        System.out.println("Please enter the operation (Add/ Div/ Sub/ Mul)");
        printLine(30,'~');
        String operation = sc.next();


        switch (operation) {
            case "Add":
                System.out.println(a + b);
                break;
            case "Sub":
                System.out.println(a - b);
                break;
            case "Div":
                System.out.println(a / b);
                break;
            case "Mul":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid choice...please try after hangout");
        }

    }
}

