package com.java.class28;
//1. Create a class called Car
//2. Create variables & methods inside Car
//3. Create constructor which takes CarName & CarYear from user
//4. Create one method in Car class which print Car configuration (All variables)
//5. call car configuration method from main method
public class Car {
    int carYear;
    String carName;
    String name;
    Car(int carYear,String carName){
        this.carYear=carYear;
        this.carName=carName;
        //
    }
    public void carConfiguration(){
        System.out.println("You have a "+carName+" "+" car year is "+ carYear);
    }

}
