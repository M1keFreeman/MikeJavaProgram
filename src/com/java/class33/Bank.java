package com.java.class33;

class Bank{
    int balance ;
    public void withdraw(int amount ){
        balance-=amount;
    }
    public void deposit(int amount){
        balance +=amount;
    }
    public void displayInterestRAte(){
        System.out.println("6.0%");
    }
}