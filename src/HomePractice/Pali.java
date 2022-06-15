package HomePractice;

import java.util.Scanner;

public class Pali {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the word to check :");
        String  name= sc.nextLine();
        Palindrome(name);

    }
    public static void Palindrome(String name){
        String rev = "";

        for(int i =name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("This name : "+ name + " is a Palindrome ");
        }else {
            System.out.println("This name : "+ name + " is not a Palindrome ");}


    }
}
