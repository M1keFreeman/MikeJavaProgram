package com.java.class28;

public class CarTester {
    public static void main(String[] args) {
        System.out.println("======================================================");
        Car user=new Car(2016,"BMW X5");
        user.carConfiguration();
        System.out.println("======================================================");
        Car user1=new Car(2020,"Toyota");
        user1.carConfiguration();
        System.out.println("======================================================");
        Car user2=new Car(2022,"Bugatti");
            user2.carConfiguration();
        user.name="Car";
    }

}
