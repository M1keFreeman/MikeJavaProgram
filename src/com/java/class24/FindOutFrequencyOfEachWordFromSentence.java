package com.java.class24;


import java.util.Locale;

public class FindOutFrequencyOfEachWordFromSentence {
    public static void main(String[] args) {
        String str ="This is java class and this class we learn java programs";

        String[] words = str.toLowerCase(Locale.ROOT).split(" ");

        for (int i = 0;i<words.length;i++){
        int count = 0;
        for (int j = 0;j<words.length;j++){
            if (words[i].equals(words[j])){
                count++;
            }

        } System.out.println(words[i].toUpperCase()+" occurs "+count+" times ");

        }
    }
}
