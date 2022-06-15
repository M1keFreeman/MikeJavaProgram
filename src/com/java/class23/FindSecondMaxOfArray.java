package com.java.class23;
//Write a program to find Second Max from an Array
public class FindSecondMaxOfArray {
    public static void main(String[] args) {

        int data[] = {35, 33, 75, 43, 23, 67};

        int firstMax=data[0];
        int secondMax =data[0];


        for (int i = 0; i < data.length; i++) {
            if (data[i]>=firstMax ) {
                firstMax = data[i];
            }else if (data[i]>secondMax){
                secondMax=data[i];
            }
        }
                System.out.println(firstMax);
        System.out.println(secondMax);


            }
        }




