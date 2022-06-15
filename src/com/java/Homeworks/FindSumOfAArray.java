package com.java.Homeworks;
//write a program to find sum of arrays inpu 1,6,7,9,5 out 29
public class FindSumOfAArray {
    public static void main (String[]args){
        int []num={1,6,7,9,5};
        int sum=0;

        for (int i =0;i<num.length;i++){
            sum+=num[i];

        }
        System.out.println(sum);


    }
}
