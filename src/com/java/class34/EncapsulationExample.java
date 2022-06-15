package com.java.class34;


class Person {

    private int medication;

    //getter
    public int getMedication() {
        return medication;
    }

    //setter
    public void setMedication(int medication) {
        if (medication > 100) {
            System.out.println("Do not overload medication");
        } else {
        }
        this.medication = medication;
    }
}


public class EncapsulationExample {
    public static void main(String[] args) {
        Person mike= new Person();
       // mike.medication = 55;
        mike.setMedication(55);
    }
}
