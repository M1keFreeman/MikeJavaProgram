package com.java.class38;


import java.io.IOException;

public class Bank {
    double amount;
 double  balance;


Bank(double amount,double balance){
    this.balance=balance;
    this.amount = amount;
}
    public  void withdraw(double amount) throws IOException {

    if (amount>balance){
        throw new IOException("Insufficient balance");
    }else {
        balance -=amount;}
}
    public void deposit(int amount){
    balance+=amount;
    }
    public void transferMoney(double amount) throws IOException {
        withdraw(amount);
        System.out.println("Amount of : "+ amount+" successfully added");
    }
    public  void payBills(double amount) throws IOException {
       withdraw(amount);
        System.out.println("Amount of : "+ amount+" successfully payed");
    }

    public static void main(String[] args) throws IOException {
    Bank b = new Bank(403,12696);
    b.transferMoney(1000);
    b.payBills(100);
    b.withdraw(60);

    }
}
