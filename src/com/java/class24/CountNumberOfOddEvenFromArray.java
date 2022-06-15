package com.java.class24;

public class CountNumberOfOddEvenFromArray {

    //
    public static void main(String[] args) {
        int []data= {34,6,7,23,8,90,35,76};
        int even=0;
        int odd=0;
        for(int i =0;i< data.length;i++){
            if (data[i]%2==0){even++;}
            else {odd++;}

        }
        System.out.println("number of even is "+even);
        System.out.println("Number of Odd is  "+odd);

    }
}
