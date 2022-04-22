package com.java.class16;
//Write a program to check odd/even number from 1 to 15
public class MethodExample2 {

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (isEven(i)){
                System.out.println(i+" Even");}
            else {
                System.out.println(i+" Odd");}


        }
    }
}
