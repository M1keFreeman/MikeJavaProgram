package com.java.class38;

import java.io.FileInputStream;

public class CheckedAndUncheckedException {

    public static void main (String args[]) {

        int a =10,b=1;
        System.out.println(a/b);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
