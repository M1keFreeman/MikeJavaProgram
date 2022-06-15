package com.java.class22;

import java.util.Scanner;

public class ArraysExample1 {
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        //Declaration of simple int;
       // int num1=10,num2=20,num3=50;

        //Arrays - are use to store multiple values in a single variable, instead of declaring separate variables for each value.

        //Declaration of Array
        int listOfNum[];//[] This we are using for Arrays

        //initialization of Array
        listOfNum=new int[5];               //5 block of integer in the memory

        //Store data into array
        listOfNum[0]=10;    //System.out.println(listOfNum[0])
        listOfNum[1]=50;    //System.out.println(listOfNum[1])
        listOfNum[2]=100;   ////System.out.println(listOfNum[2])
        listOfNum[3]=40;    ////System.out.println(listOfNum[3])
        listOfNum[4]=60;     //System.out.println(listOfNum[4])

        //Declaration and initialization of array
        int data[]={23,42,56,76,52,12};



        //Print all numbers from array
//        for (int i =0;i<=4;i++)
//        System.out.println(listOfNum[i]);

        for (int i =0;i<listOfNum.length;i++)        // or just  get equals and to do -1  cuz inder start from 0;
            System.out.println(listOfNum[i]);

        //Find Length of Array
//        System.out.println("Length of array "+listOfNum.length);

        //It'll throw arrayIndexOutOfBound Exception
      // System.out.println(listOfNum[5]);


    }


}
