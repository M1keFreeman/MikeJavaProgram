package com.java.class27;

public class Bank {
            int balance;
            String accNumber;
            String accName;

            void deposit(int amount){
                System.out.println("Deposited "+ amount+" into "+accName+"'s account");
                balance=balance+amount;

            }
            void withdraw(int amount){
                System.out.println("Withdrawing "+ amount+" from "+accName+"'s account");
                balance=balance-amount;


            }
            void displayBalance(){
                System.out.println(accName+"'s balance is "+balance);

            }
            void changeMyVar(int a){
                a = 50;
            }
            void changeMyObject(Bank acc){
                acc.balance = 5000;
                acc.accName= "Misha";
            }

}
