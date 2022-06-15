package com.java.class31;

class GrantParent{
    int a =40;
}

class Parent extends GrantParent{
    int a = 10;////instance variable of super class
}

class Child extends Parent {
    int a = 20;  //instance variable of sub class

    public void printDAta() {
        int a = 50; //local variable
        System.out.println(a);//50
        System.out.println(this.a);//20
        System.out.println(super.a);//10


    }
}

public class ExampleOfThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.printDAta();
    }


}
