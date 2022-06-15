package com.java.class28;

public class Human {

           String firstName;
           String lastname;
           double height;
          double  weight;
             int year;
             String career;
             String word;



             void yourAge(int year) {
                 System.out.println("I Am " + year + " and my name is " + firstName);

             }

    void yourWeightAndHeight(double weight, double height) {
        System.out.println("My weight is: " + weight + " and my Height is " + height);
    }

    void careerGuidance( int year, double height, double weight) {
        if (year >= 18 && year <= 35) {
            if (height >= 5 && weight >= 150 && weight <= 260) {
                System.out.println("Your age " + year + " , weight " + weight + " , height " + height + " is good. Your will be  " + career);
            }
            }else {
            System.out.println("We are sorry ,You don't pass the test ");
        }

    }
    void lastN(String lastname){
        System.out.println("My name is: "+firstName+" "+lastname);
    }

}


