package com.java.class23;

//Write a program to print sum of positive and negative numbers from an array

public class FindSumOfOfPositiveAndNegative {
    public static void main(String[] args) {
        int data[] = {5, 8, 2, -4, -13, 3, -7, 12};
        System.out.println(getAvgOfNumber(data));

    }


    static int getAvgOfNumber(int[] data) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < data.length; i++) {

            if (data[i] > 0) {

                positive += data[i];


            } else {
                negative+=data[i];
            }

        }
        System.out.println(positive);
        System.out.println(negative);


        return -1;

    }
}



