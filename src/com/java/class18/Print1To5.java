package com.java.class18;
//Print 1
//      12
//      123
//      1234
//      12345

public class Print1To5 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++) {
            for (int b =1;b<=i;b++){
                System.out.print(b);
            }
            System.out.println();
        }

        }
    }

