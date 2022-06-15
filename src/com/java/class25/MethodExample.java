package com.java.class25;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        int result  = getNumberFromUser() + method1(getNumberFromUser());
        System.out.println(result);
    }
    static int method1(int data){
        return data * 10;
    }
    static int getNumberFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = sc.nextInt();
        return num;
    }
}
