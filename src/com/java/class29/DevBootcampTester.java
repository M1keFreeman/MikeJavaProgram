package com.java.class29;

public class DevBootcampTester {
    public static void main(String[] args) {
        BootcampStudent mike = new BootcampStudent();
        BootcampStudent andriy = new BootcampStudent();
        BootcampStudent oleg=new BootcampStudent();

        mike.instructorName="Crirag";
        mike.mentroName="Tim";

        andriy.instructorName="Mike";
        andriy.mentroName="James";

        oleg.instructorName="Dana";
        oleg.mentroName="Roma";

        System.out.println(BootcampStudent.instructorName);
        System.out.println(BootcampStudent.mentroName);
    }
}
