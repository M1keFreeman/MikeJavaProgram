package com.java.class22;
//write a java program to print max number from an array
public class FindMaxFromArray {
    public static void main(String[] args) {
        int data[]={35,33,55,43,75,67};
        int max=0;

        for (int i =0;i<data.length;i++)
        if (data[i]>max){
            max=data[i];}
            System.out.println("MAx number is " + max);

    }
}
