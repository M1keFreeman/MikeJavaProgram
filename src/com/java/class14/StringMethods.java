package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        //1.Check equality of two String
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to DevX!";
        System.out.println("1. Equality " + str1.equals(str2));
        System.out.println("========================================================================================");

        //2. Check equality of two String ignoring case
        System.out.println("2.Equality ignoring case " + str1.equalsIgnoreCase(str2));
        System.out.println("========================================================================================");

        //3. Check one String contains another String
        //Contains will only check one String contains another String considering case-sensitive

        System.out.println("3.Contains " + str3.contains(str1));
        //System.out.println("3.Contains " + str3.toUpperCase().contains(str1.toUpperCase())); another way to write;

        System.out.println("========================================================================================");
        //If we want to check one String contains another String ignoring case then ve have to change
        //both String in same case and then check contains,so it'll check only content of both String
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println("3.1 Lower Case " + str3LowerCase.contains(str2LowerCase));

        System.out.println("========================================================================================");
        //4.Changing the case of String
        System.out.println("4.Upper case " + str3.toUpperCase());
        System.out.println("4.Upper case " + str3.toLowerCase());
        System.out.println("========================================================================================");

        //5.Find index of charter//number of letter//on Index count start from 0 to .....
        str1="Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println("5.Index Of Char "+ str1.indexOf('W'));
        System.out.println("5.last Index of Char " +str3.lastIndexOf('W'));
        System.out.println("========================================================================================");

        //6.Find character at Index//which letter is on that number
        str1="Hello World";
        System.out.println("6.Index of Char: "+str1.charAt(0));
        System.out.println("========================================================================================");

        //7.Length of String //here count start from 1to .....
        str1="Hello World";
        str3 = "Hello World! Welcome to DevX!";
        System.out.println("7.Length of String "+str1.length());
        System.out.println("7.Length of String "+str3.length());

        System.out.println("========================================================================================");

        //8.Empty and Blank
        str1="          ";// will be false cuz we have spaces //here we can use isBlank to check if its empty';
        str3 = "";//
        System.out.println("8.Length of String "+str1.isEmpty());
        System.out.println("8.Length of String "+str3.isEmpty());
        System.out.println("8.Length of String "+str1.isBlank());
        System.out.println("8.Length of String "+str3.isBlank());

        System.out.println("========================================================================================");
        //9. Replace &ReplaceAll


        str1 = "PRICE IS INR 200 INR 300 INR 500";

        // another way System.out.println("9.Replace"+str1.replace(str1,str3));
        System.out.println("9.ReplaceAll" + str1.replace("INR","USD "));
        System.out.println("9.ReplaceAll" + str1.replaceAll("[a-zA-Z]",""));

        System.out.println("========================================================================================");

        //10. Format// .format change only %s to name what you add
        str1="Hello %s,Welcome to %s";
        System.out.println("10. Format: " + String.format(str1,"Mike","Home"));

        System.out.println("========================================================================================");
        //11. Substring
        str1="Welcome to java class. Today is hard day";
        System.out.println("11. Substring " + str1.substring(7));
        System.out.println("11. Substring " + str1.substring(0,7));


        System.out.println("====================================");
        //12. Split
        str1="Welcome to java class. Today is hard day";
        String[] words=  str1.split(" ");
//       System.out.println("12.Split "+ words[0] + words[1] + words[2] + words[3]);

        //Find a length
        System.out.println(words.length);
        for (int i=0;i < words.length;i++){
            System.out.println("12.Split " + words[i]);
        }
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
//        System.out.println(words[3]);
//        System.out.println(words[4]);
        System.out.println("========================================================================================");
    }
}
