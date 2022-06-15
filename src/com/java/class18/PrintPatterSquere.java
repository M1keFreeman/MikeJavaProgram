package com.java.class18;

public class PrintPatterSquere {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {//Print numbers of rows//It will run 10 times/
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("&");
                }
                //Print 1 to 5 in the same line/If we want to get output 1111 2222 3333,just need to change value of J to i
            }
            System.out.println();//This works like enter

        }

    }

}