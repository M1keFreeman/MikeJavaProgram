package com.java.Homeworks;

public class LogicalOperatorExamples {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false, b3 = true;

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true
        System.out.println(!b1 || !b2); //true
        System.out.println(b3 || b1 && b2); // true first priority hava &&(AND) and then ||(OR)
        System.out.println(b1 && b3 && b2 || b2 ||b3 && b1 && b2 || b1 ); //true
        System.out.println(b1 && b2 || b2 && b3 || b1 && !b3); // false
    }
}
