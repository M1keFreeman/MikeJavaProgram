package com.java.class35;



abstract class Dog {

   abstract public void bark();
    public abstract  void poop();
}
    class Roki extends Dog{

        @Override
        public void bark() {
            System.out.println("Bark!");
        }

        public void poop(){
        System.out.println("Dog pooped");
    }
}


    public class AbstractTutorial {
    public static void main(String[] args) {

        Roki d = new Roki() ;
        d.bark();
        d.poop();


    }
}
