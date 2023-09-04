package Uvazifa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ismingizni kriting: ");
        String name1 = sc.next();
        String name = "Umidjon";
        System.out.print("Familyani kirting: ");
        String familya1 = sc.next();
        String familya = "Xasanov";
        if (name1.equals(name) && familya1.equals(familya)){
            System.out.println(" Hush kelibsiz Admin");

        }
        else {
            System.out.println(" Siz royxatdan o'tmagansiz ");
        }

    }
}
