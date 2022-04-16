package com.java.class14;

import java.util.Scanner;

//Take Full Name from user and Print initials of it /// like M.A.
public class PrintInitials {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String fullName = sc.nextLine();
        String[] firstName=fullName.split(" ");


        System.out.println(fullName.charAt(0) + ".");
    }
}
