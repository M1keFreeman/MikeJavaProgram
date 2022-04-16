package com.java.class14;

//Write a program to print each component of String into separate Line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "1206 Rich Ct Wheeling,Il,600124";
        String[] city = address.split(" ");{
            System.out.println(city[0]);
            System.out.println(city[1]);
            System.out.println(city[2]);

        }

        }

    }

