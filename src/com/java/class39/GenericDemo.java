package com.java.class39;

import java.util.ArrayList;
import java.util.List;


    public class GenericDemo {
        public static void main(String[] args) {
             Box<Integer>b1= new Box<Integer>();
             Box<String>b2 = new Box<String>();


             b1.setNum(10);
             b2.setNum("Mike");
            System.out.println(b1.getNum());
            System.out.println(b2.getNum());

        }
    }

