package com.java.class26;

public class FindMinFromArray {
    public static void main(String[] args) {

        int data[]={20,10,12,60,32};

        int min =data[0];//We are starting from array 0

        for (int datum: data){
            if (datum < min){
                min=datum;
            }
        }
        System.out.println(min);


            }
        }


