package HomePractice;
//a e i o u

import java.util.Locale;
import java.util.Scanner;

public class CheckIfWordIsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter   = sc.next().charAt(0);

        CheckIfWordIsVowel ch = new CheckIfWordIsVowel();

        ch.VowelOrNot(letter);


    }
    public void VowelOrNot(char letter){
        switch (letter){
            case 'a' : case 'e': case 'i' : case 'o': case 'u': {
                System.out.println("Is Vowel");
            }break;
            default:{
                System.out.println("Is not Vowel");
            }
        }

    }
    }

