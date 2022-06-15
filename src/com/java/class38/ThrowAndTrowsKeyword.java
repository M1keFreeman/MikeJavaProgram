package com.java.class38;

import java.io.IOException;

public class ThrowAndTrowsKeyword {



    public static void method1() throws IOException {
int i=1,j=0;
        System.out.println(i/j);
    }
    public static void mathod2() throws IOException{
method1();
    }
    public static void method3() throws IOException{
    mathod2();
    }

    public static void main(String[] args) throws IOException {
        method3();
    }











}
