package com.java.class39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InClassAssignment {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Today");
        list.add("Is a ");
        list.add("nice ");
        list.add("day");


        System.out.println("Is Duplicate " +list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());


        System.out.println("We are using Base For loop");
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("We are use enhance for lop");
        for (String day : list ){
            System.out.println(day);
        }
        System.out.println("Print all with Iterator");

        Iterator<String> word = list.iterator();
        while (word.hasNext()) {
            System.out.println(word.next());
        }

    }
}
