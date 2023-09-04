package lesson2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("ismingini kiriting: ");
        String name = sc.next();
        System.out.print("Yoshingizni kiriting: ");
        int yosh = sc.nextInt();
        System.out.print("Kasbingiz nima: ");
        String kasb = sc.next();
        System.out.println("ismi " +name + " yosh " + yosh + " kasbi " +kasb);


       
    }
}
