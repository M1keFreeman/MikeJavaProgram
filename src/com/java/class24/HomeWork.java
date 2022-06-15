package com.java.class24;

public class HomeWork {
    public static void main(String[]args){
//======  Homework ==========
//Find sum of Individual row in 2D array
//Example input:
//3 4 6
//7 6 4
//9 9 2
//Output :
//Sum of  row1 = 13
//Sum of  row2 = 17
//Sum of row3 = 20
//  2.  Find the Transpose of Matrix (interchanging its rows into columns or columns into rows)
//Example Input
//1 2 3
//4 5 6
//7 8 9
//Output
//1 4 7
//2 5 8
//3 6 9 (edited)


        //#2
//        int data[][]={{1,2,3},{4,5,6},{7,8,9}};
        //int data[][] = {{4, 13, 3}, {24, 51, 36}, {70, 28, 59}};
        int data[][]={{100, 13, 3},{-24,-51,-36},{70,28,59}};

        for (int i = 0; i < data.length; i++) {
            int max = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] > max)
                    max = data[i][j];
            }
            System.out.println(max);
        }


    }

}




