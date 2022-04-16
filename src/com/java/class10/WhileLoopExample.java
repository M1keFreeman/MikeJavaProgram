package com.java.class10;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
//        while (i <= 10) {
//            i++;
//            System.out.println(i); //answer will be 6 when <= and < will be 5
//            i++;   //
        while (i <= 20) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}


