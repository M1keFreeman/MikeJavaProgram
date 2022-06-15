package com.java.class21;

public class PrintEndDigits {
    public static void main(String[] args) {
        int num=2533243;

            while (num>0){
                System.out.print(num%10);
                num=num/10;}
    }
}
