package com.java.class20;

public class HomeWork1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }//Another way
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(6 - j);
            }
            System.out.println();
        }
        for (int i = 5; i <= 9; i++) {        //increment  ++  <=
            for (int j = 9; j >= i; j--) {    //decrement  --  >=
                System.out.print(j);
            }
            System.out.println();

            //Another aproach
        }
        for (int i = 5; i >= 1; i--) {
            int k = 9;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k--;
            }
            System.out.println();

        }
        for (int i = 3; i <= 8; i++) {              //6 rows - рядки
            for (int j = 1; j <= 5; j++) {          //12345
                System.out.print(j);

            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {              //3 rows
            for (int j = i; j <= 5; j++) {          //5 stars
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {              //6 rows - рядки
            for (int j = i; j <= i + 1; j++) {          //12345
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
