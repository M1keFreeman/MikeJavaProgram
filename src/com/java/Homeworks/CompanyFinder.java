package com.java.Homeworks;

import java.util.Scanner;
//1. Write a java program to Find Company name from the given product
//   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
//   Possible Outputs = {google, facebook, microsoft}
public class CompanyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the company name");
        String company = sc.nextLine();

        switch (company){
            case "GMail":
            case "Youtube":
            case "Hangouts":
                System.out.println(" It is Google");break;

            case "Outlook":
            case "Skype":
                System.out.println("It is Microsoft");break;
            case"What's up":
                System.out.println("It is Facebook");
        }
        }
    }

