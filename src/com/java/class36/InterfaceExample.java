package com.java.class36;

interface Bank{
        // all variable in interface be default public,static ,final
    int ROUTING_NUMBER =1000;

    //All method in interface are by default public and abstract
    public void deposit(int amount );
    public void withdraw(int amount);

    void createOffers();
}

interface  PSUBank extends Bank{
    void createOffers();
    void additionalSecurity();

}
interface Bulding{

    void additionalSecurity();
}

class ChaseBank implements Bank,Bulding{

   Bulding b = new ChaseBank();


    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
    @Override
    public void createOffers(){

    }
    @Override
    public void additionalSecurity(){

    }
}


public class InterfaceExample {
}
