package com.java.class30;

class Car{
    static int staticCount;
    int instanceCount;

    Car(){
        staticCount++;
        instanceCount = staticCount;
    }

    void printCount(){
        System.out.println(instanceCount);
    }
}


public class Question12 {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2= new Car();
        c2.printCount();
        Car c3=new Car();
        Car c4=new Car();
        Car c5= new Car();
        c5.printCount();


    }
}
