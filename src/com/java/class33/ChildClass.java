package com.java.class33;

public class ChildClass extends Parent {
    public void method1() {
        System.out.println("c1");
    }

    public void method2() {
        System.out.println("c2");
    }

    public void method3() {
        System.out.println("c5");
    }

    public void method4() {
        System.out.println("c6");
    }
}

class mainClass {
    public static void main(String[] args) {
        Parent p = new ChildClass();
        p.method1();
//        p.method2();
//        p.method3();
//        p.method4();
    }
}

