package com.java.class24;


//Write a program to find length od each word
public class FindLengthOfEachWordFromSentence {

    public static void main(String[] args) {

        String word="The Times of India is an Indian English language daily newspaper and digital news media owned and managed by The Times Group It is the third largest newspaper in India by circulation and largest selling English language daily in the world";
        String [] strArr=word.split(" ");
        for (int i =0;i<strArr.length;i++){
            System.out.println(strArr[i]+" = "+strArr[i].length());
        }
    }
}
