package com.java.Homeworks;
//Write a program to print all numbers from 1 to 50 which has more than 5 divisor
public class HomeWordkDivisibleby5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (isNumHasMoreThanFiveDivisor(i)) {
                System.out.println(i);
            }
        }
    }

    //Method Definition/Method Implementation
    static boolean isNumHasMoreThanFiveDivisor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count >= 5;
    }
}