package com.java.GroupSession;


import java.util.Scanner;

//ask: Write java Program to Find Smallest and Largest Element in an Array.
public class FindMaxAndMinFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = {66, 6, 46, 90,1 ,22, 30};

        System.out.println(smallNum(data));
        System.out.println(largeNum(data));


    }

    public static int smallNum(int[] data) {
        int small = data[0];

        for (int i = 0; i < data.length; i++) {

            if (data[i]<=small) {
                small=data[i];
            }
        } return small;

    }public static int largeNum(int []data){
        int large = data[0];
        for (int i =0;i< data.length;i++) {

            if (data[i]>=large){
                large=data[i];
            }
        }
        return large;
    }
}
