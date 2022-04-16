package com.java.class07;
//Take price from user and print discount value based on price

import java.util.Scanner;

//less 100 then print no discount
//less than 500 then print - 5%
//less than 1000 then print - 10%
//more than 1000 then --15%
public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        int price = sc.nextInt();
        if (price < 100) {
            System.out.println("no Discount");
        } else if (price < 500) {
            System.out.println("5% Discount");
        } else if (--price < 1000) {
            System.out.println("10% Discount");
        } else if (++price > 1000) {
            System.out.println("15% Discount");
        }else { System.out.println("No more Discounts");
        }
    }
}