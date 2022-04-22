package com.java.class15;

import java.util.Scanner;

public class StringDemoo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = "Hello";
//String buffer uses the buffer mechanism to protect data from being access and update simultaneoly
        //so,it's thread-safe.
        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();
//String builder doen't have buffer mechanism so it's faster that StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
