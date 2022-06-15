package com.java.class33;

class Miami extends Vocation{
    @Override
    public void travelTo() {
        super.travelTo();
        System.out.println("And get burn at the Sun =))");

    }
}
class BAcktoHome extends Vocation {
    @Override
    public void thaverFrom() {
        super.thaverFrom();
        System.out.println(" And end of the day , we can get a cup of Hot tea =) ");

    }
}



public class VocationList {

    public static void main(String[] args) {
      Miami chill = new Miami();
        chill.travelTo();
        BAcktoHome backTo = new BAcktoHome();
        backTo.thaverFrom();

    }
}
