package com.java.class13;

import java.util.Scanner;

public class StringAssighment {
    public static void main(String[] args) {
        //Create three String variables->
        //initialized two variables with constant value
        //take third  variable value from user using Scanner class
        //Compare 1st and 2nd  using ==operator
        //Compare 2nd and 3rd using ==operator
        //Compare 1st and 3rd using .equals operator method
        Scanner sc = new Scanner(System.in);
        String wish = "Dream";
        String wishes = "Dream";
        String luck = sc.nextLine();
        if (wish == wishes) {
            System.out.println("YOu got that Wishes");//True
        } else {
            System.out.println("You not get that ");
        }
        if (wishes == luck) {
            System.out.println("You goy Wish and luck ");//False
        } else {
            System.out.println("Non of that");
        }
        if (wish.equals(luck)) {
            System.out.println("You got that Wishes");//True
        } else {
            System.out.println("sorry");
        }
    }
}
