package com.java.class22;

import java.util.Scanner;

public class HomeWork<numb> {

    //============== Homework =======================
    //Write a program to find maximum digit from the given number (Example input - 4346345, Ouput - 6)-
    //Write a program to Count Number of Digit (Example input - 4345, Ouput - 4)-
    //Write a program to Reverse number (Example input - 4345, Ouput - 5434)+
    //Write a program to Check Given number is Palindrome or not (Example input - 23532, Ouput - Yes)-
//sc.nextInt()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //#3

        int num = sc.nextInt();

        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }

        System.out.println();
            //#4
            //Interview Task

        int number = sc.nextInt(); ///exs number :1234321

        int rev = 0; // here we have to store our revarce number

        int backUpOfOriginalNumber = number; //Here we store Number from if() where it will check Number wit h reverce to check if it is Palindrome

        while (number > 0) {

            int lastDigit = number % 10;
            rev = rev * 10 + number % 10;
            number = number / 10;             // this is for getting next number
        }
            //        System.out.println(number);
            //        System.out.println(rev);
        if (backUpOfOriginalNumber == rev) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("In Not Palindrome");
        }
        System.out.println();

        int number1 = 16495;
        int max = 0;//9


        while (number1 != 0) {

            if (max <number1 % 10) {
                max = number1 % 10;

            }
            number1 = number1 / 10;

        }   System.out.println(max);

        int length =4543;
        int count = 0;
        while(length!=0){


//            length=length%10;
            length/=10;
            count++;

        } System.out.println(count);
    }



}





