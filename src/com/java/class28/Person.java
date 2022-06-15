package com.java.class28;
//1. Create class called Person
//2. Create variable and methods of Person class
//3. Create constructor which will take name and age of Person
//4. Create another Constructor which will take zero argument
//5. Create another Construct which will take name and phoneNumber of Person
//6. Create Person tester and create three objects of person using different Constructor
//7. Try to print all variables of person class
public class Person {
    String name;
    int age;
    String phoneNumber;
    Person(String nameFromUser, int ageFromUser){
        name = nameFromUser;
        age = ageFromUser;
    }
    Person(String nameFromUser, String phoneNumberFromUser){
        name = nameFromUser;
        phoneNumber = phoneNumberFromUser;
    }
    Person(){
        name = "mike";
        age = 10;
    }
    public void printPersonDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
    }
}