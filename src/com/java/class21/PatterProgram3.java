package com.java.class21;
//    1
//   121
//  12321
//123451234
public class PatterProgram3 {
    public static void main (String[]args){

        for (int i = 1; i <= 9; i++) {
            //Print spaces in each row
            for (int s =1;s<=10-i;s++){
                System.out.print(" ");
            }
            //Print digits in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);}
                for (int j =i-1;j>=1;j--){
                System.out.print(j);
            }//Print Enter
            System.out.println();
        }

    }
}
