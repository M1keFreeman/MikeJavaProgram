package com.java.RomasClass;

public class ExtraSession {
    public static void main(String[] args) {
        String name="Alex";
        String surname="Bruna";

        sayGoodBye();

        ExtraSession object = new ExtraSession();
        object.sayWhatUp();//This Example is just creating object without Static keyword

        System.out.print(sayHello(name,surname));


    }
    public static String sayHello(String name,String surname){

        //1=>String inside this this method means that we have return type
        //2=>this method has a parameter calls String name
        //if we have keyword Static we don't need to create an object

        return "Hello "+ name + " and "+ surname ;
    }
    public static void sayGoodBye(){
        //1=> we dont have a return type
        //2=> we dont have a params
        //3=>we dont need to create and object
        System.out.println("See you later alligator");

    }
    public void sayWhatUp(){
        //1=> we dont have a return type
        //2=> we dont have a params
        //3=> we have to create an object becouse we dont have a Static keyword

        System.out.println("Whats up Java Killer");
    }
}

