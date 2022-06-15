package com.java.class37;

public class ExceptionWithFinally {
    public static void main(String[] args) {


        int[] num = {32, 54, 21, 62, 34};

        try {
            System.out.println(num[5]);

        }catch (ArithmeticException e ){
            System.out.println("Exseption Handled");

        }finally {

        System.out.println("Browser Close");}
    }
    }