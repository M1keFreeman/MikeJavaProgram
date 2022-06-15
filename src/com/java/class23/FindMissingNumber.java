package com.java.class23;
//write a program to find missing number from an array of 1-10
public class FindMissingNumber {
    public static void main(String[] args) {

        int data[] = {9,2,10,4,6,5,7,1,3};
        int sum=0;
        int sumOfArray=0;
        //Find sum of 1-10
        for (int i =1;i<=10;i++) {
            sum=sum+i;
        }
        //find sum of array element
           for (int num : data){
               sumOfArray=sumOfArray+num;
           }
        for (int num : data){
            System.out.println(num);}
        System.out.println("Missing number "+(sum-sumOfArray));
        }

        }



