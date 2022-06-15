package com.java.class34;

public class WrapperClass {
    public static void main(String[] args) {
        int i =10;
        Integer j =i ;// Auto boxing = means we are converting primitive data to object

        String s1 = "10",s2 = "20";
        //Integer.parseInt(s1) = convert String to Integer



        //Convert String to int
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
        //Convert int to String
        System.out.println(String.valueOf(j)+i);
        //Convert int to String
        System.out.println(j.toString()+i);

    }
}
