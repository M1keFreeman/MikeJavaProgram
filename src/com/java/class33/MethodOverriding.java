package com.java.class33;

class ChaseBank extends Bank{

    @Override
    public void displayInterestRAte(){
        super.displayInterestRAte();
        System.out.println("7.0%");
    }
}

class  WellsFargo extends Bank{
    //Annotation
    @Override
    public void displayInterestRAte(){
        System.out.println("5.0%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
       ChaseBank cb = new ChaseBank();
       cb.displayInterestRAte();

       WellsFargo wf = new WellsFargo();
       wf.displayInterestRAte();
    }


}
