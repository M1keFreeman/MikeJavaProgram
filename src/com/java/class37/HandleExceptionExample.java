package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int person1= sc.nextInt();
            int person2 = sc.nextInt();
            System.out.println(person1 / person2);
        }catch (Exception x){
            System.out.println(" Dude you are pus the wrong character, be more careful ^_^");}


        System.out.println(" All Done have a nice day ");
    }
}
