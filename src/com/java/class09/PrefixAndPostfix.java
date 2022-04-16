package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {
        int i = 4, j = 4, k=4;
        i=j++;
        j=k++;
        k=--i;


        int m = i + j + k--;


       //Postfix Operator // i++ --->operators comes after the variable --first complete all other operators and then increment the value of variable!

        //  PreFix ++i -operators come before the variable| first complete all other operations and then increment the value of variable!

         System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
