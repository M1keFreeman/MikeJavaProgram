package com.java.class08;

import java.util.Scanner;

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        //Take three number from user and print maximum number ot three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("This is a bigger number" + num1);
        } else if (num2 > num3  ) {
            System.out.println("This is a bigger number" + num2);
        } else {
            System.out.println( "This is bigger number " + num3);

    }
}
}
