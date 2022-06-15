package com.java.class21;
//Write a program to print each digit of
public class FinsSumOfEachDigitofNumber {
    public static void main(String[] args) {
        int num =325;
        int hold=0;
        //output-10
        while (num!=0){
            hold=hold+(num%10);
        num=num/10;};
        System.out.println(hold);
    }
}
