package com.java.class31;
//Parent
class callSuper{

    public void  ChillClass2(){
        System.out.println("2");
    }

}
//Child (Sub class)
class callSub extends callSuper{
     public void ChillClass2(){

         System.out.println("1");
     }

}



public class SuperClassHMPractice {
    public static void main(String[] args) {

        callSub cs = new callSub();
        cs.ChillClass2();
    }
}
