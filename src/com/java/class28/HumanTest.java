package com.java.class28;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Human h = new Human();
        System.out.println("Please enter first  name : ");
        h.firstName= sc.nextLine();
        System.out.println("Enter your last name : ");
        h.lastN(sc.nextLine());
        System.out.println("Enter your future career ");
        h.career= sc.nextLine();



        System.out.println("Enter your age,height in inches ,and  weight in lbs ");
        h.careerGuidance(sc.nextInt(), sc.nextInt(), sc.nextDouble());








    }
}
