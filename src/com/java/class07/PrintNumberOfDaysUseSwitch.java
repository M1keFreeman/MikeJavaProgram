package com.java.class07;

import java.util.Scanner;
//Take Month name from user and print number of days in given month.
//days in given month
public class PrintNumberOfDaysUseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = sc.nextLine();
        switch (month) {
            case "January":
            case "October":
            case "December":
            case "May":
            case "March":
            case "July":
            case "August":
                System.out.println("31 days");
                break;
            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Please enter month");

        }
    }
}
