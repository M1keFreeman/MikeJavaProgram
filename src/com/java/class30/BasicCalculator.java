package com.java.class30;


public class BasicCalculator {

    //Parent/Super/Base Class
    public void sum(int a, int b) {
        System.out.println("sum = "+(a + b));
    }

    public void sub(int a, int b) {
        System.out.println("sub = "+(a - b));
    }

}
    //Child/Sub/Derived Class
class AdvanceCalculator extends BasicCalculator {

    public void div(int a, int b) {
        System.out.println(a / b);
    }

    public void mul(int a, int b) {
        System.out.println(a * b);
    }
}