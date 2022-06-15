package com.java.class28;

public class Bank {
    //Variables of CLass
    int balance;
    String accName;


    //Constructor of Class
    Bank(int balance,String accName) {
        this.balance=balance;
        this.accName=accName;
    }
    public void deposit(int amount) {
        System.out.println("depositing into " + accName + " " + amount);
        balance += amount;

    }

    //Methods of Class
    public void withdraw(int amount) {
        System.out.println("withdrawing from "+accName+" "+amount);
        balance -= amount;
    }



    public void showBalance() {
        System.out.println(balance);
    }
}
