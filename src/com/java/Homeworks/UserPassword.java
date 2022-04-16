package com.java.Homeworks;

import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) {
        //3. Write a program to take username and password from user and print appropriate message
        //based on below conditions
        //	1. If username correct and password correct ---> Login successful
        //	2. If username correct and password incorrect --> Invalid password
        //	3. If username incorrect and password correct --> Invalid username
        //	2. If username incorrect and password incorrect --> Login unsuccessful
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the username");
        String username = sc.nextLine(), expUsername = "Mike";

        System.out.println("Enter the password");
        String password = sc.nextLine(), expPassword = "123456";

        //Approach 1
        if (username.equals(expUsername) && password.equals(expPassword)){
            System.out.println("Login successful");
        } else if (!username.equals(expUsername) && !password.equals(expPassword)) {
            System.out.println("Login Unsuccessful");
        } else if (!password.equals(expPassword)) {
            System.out.println("Invalid password ");
        } else {
            System.out.println("invalid username");


////        //Approach 2
//        if (username == expUsername) {
//            if (password == expPassword) {
//                System.out.println("Login Successful");
//            } else {
//                System.out.println("Invalid password");
//            }
//        } else if (password == expPassword) {
//            System.out.println("Invalid username");
//        } else {
//            System.out.println("login Unsuccessful");
//
//   Approach 3
//            if (username == expPassword) {
//            if (password==expPassword) {
//                System.out.println("Login Successful");
//            }else {
//                System.out.println("invalid password");
//              }
//           } else {
//           if(password == expPassword) {
//                System.out.println("Invalid username");
//            }else{
//                System.out.println("Login Unsuccessful");
//            }
        }

        }
    }




