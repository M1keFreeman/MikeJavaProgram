package com.java.class12;

public class Print10To1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}