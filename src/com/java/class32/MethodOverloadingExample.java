package com.java.class32;

class FligthBooking {
    public void bookTicket() {
        System.out.println("Booking with your username");
    }

    public void bookTicket(String name) {
        System.out.println("Booking with your " + name);
    }

    public void bookTicket(int seatNumber,String name) {
        System.out.println("Booking with your " + seatNumber);
    }
    public void bookTicket(String name,int price) {
        System.out.println("Booking with your " + name);
    }
    public void bookTicket(int price) {
        System.out.println("Booking with your " + price);
    }


}

public class MethodOverloadingExample {
    public static void main(String[] args) {

    }
}
