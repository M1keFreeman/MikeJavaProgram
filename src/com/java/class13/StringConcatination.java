package com.java.class13;

public class StringConcatination {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2="DevX";
        int a =10;
        int b =20;
        int c =5;
        System.out.println("Addition"+(a+b));
        System.out.println("Addition"+a+b+c);
        System.out.println(a+b+"Addition");
        System.out.println( a+b+"Addition"+a+b);
       // System.out.println(a+"Addition" +b-c); will be an error cuz of  minus(-)
        System.out.println(a+"Addition"+(b-c));//in this case - have more prioriti
    }
}
