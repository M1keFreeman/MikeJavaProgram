package com.java.Homeworks;

import java.util.Scanner;

public class LinuxHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the username");
        String username = sc.nextLine();
        String expUsername = "Mike";
        System.out.println("Please enter the password");
        String password = sc.nextLine();
        String expPassword = "123456";
        if (username !=(expUsername) && password.equals(expPassword)) {
            System.out.println("Login is successful");
        } else if (username.equals(expUsername) && password.equals(expPassword)){
            System.out.println("Wrong username");
        } else if (username.equals(expUsername) && password != expPassword) {
            System.out.println("Wrong password ");
        } else {
            System.out.println("Login is invalid");
        }

    }
}
