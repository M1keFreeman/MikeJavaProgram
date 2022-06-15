package com.java.class39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
      List<Integer> list1 = new ArrayList<Integer>();
      List<String> list2 = new ArrayList<String>();


      list1.add(6);
      list1.add(15);
      list1.add(1993);

      list2.add("Couple more hours and ");
      list2.add("Happy");
      list2.add("Birthday");
      list2.add("Mike");

      list2.remove("Couple more hours and ");// removing the word
      list2.remove(0); //removing the value on index 0 "Happy"



        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list2.contains("Couple more hours and "));
        System.out.println(list2.get(0));
        System.out.println(list2.isEmpty());
        System.out.println(list2.size());


       Object[] array = list2.toArray(); //Object[]  save string in to array and using toString to print it.
       for (Object str : array){
           System.out.println(str.toString());
       }


       //Print All Data from List -way 1 using Index base
        System.out.println("print data using based for loop");
        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
        System.out.println("Print data using enhance for loop");
        //Print All Data from List -way 1 using enhance for loop
        System.out.println("print data using based for loop");
        for (String item : list2){
            System.out.println(item);
        }
        //Print all data From List using Way 3 : Using Iterator
        System.out.println("Print data using Iterator");
        Iterator<String> itr= list2.iterator();
        System.out.println(itr.next());
    }
}
