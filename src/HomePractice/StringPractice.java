package HomePractice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev= "";
        System.out.println("Enetr the wword");
        String name = sc.nextLine();
        int lenght=name.length();
        for (int i=lenght;i<=0;i--)
            rev+=name.charAt(i);
        System.out.println("It is pol");

    }
}