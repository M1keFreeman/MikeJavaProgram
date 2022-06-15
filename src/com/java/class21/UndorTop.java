package com.java.class21;

public class UndorTop {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            //Print spaces in each row

            for (int j = 5;j>=i;j--){
                System.out.print(" ");}

            for (int s =1;s<=i*2-1;s++){
                System.out.print("*");}


            System.out.println();
        }
    }
}


