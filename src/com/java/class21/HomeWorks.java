package com.java.class21;
/*

1
12
123
1234
12345

5
54
543
5432
54321

1
33
555
7777
99999*/

public class HomeWorks {
    public static void main(String[] args) {
        //#1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //#2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //#3
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        //#4
        for (int i = 1; i <= 9; i=i+2) {
            for (int j = 1; j <= (i+1)/2; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }

}
