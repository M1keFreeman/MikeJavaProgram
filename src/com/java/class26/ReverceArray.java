package com.java.class26;

public class ReverceArray {
    public static void main(String[] args) {
         int []data={30,40,10,50,32};
        int j= data.length-1;

        for (int i=0;i< data.length/2;i++){

            int temp =data[i];
            data[i]=data[j];
            data[j]=temp;
            j--;
        }
        for (int num : data){
            System.out.println(num);
        }
//        for (int i= data.length-1;i>=0;i--){
//            System.out.println(data[i]);
//        }



    }}
