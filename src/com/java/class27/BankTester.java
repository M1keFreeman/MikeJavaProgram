package com.java.class27;

public class BankTester {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        b1.balance = 1000;
        b1.accName = "Mike";
        b1.accNumber = "2492";

        b1.deposit(2000);
        b1.withdraw(300);
        b1.displayBalance();

        b2.deposit(1000);
        b2.withdraw(500);
        b2.displayBalance();

        int a =10;
        b1.changeMyVar(a);
        System.out.println(a);

        b2.changeMyObject(b1);
        b1.displayBalance();

        System.out.println(b1.balance);
    }
}
