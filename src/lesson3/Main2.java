package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a = 16;
        int b = 13;
        if (a > b) {
//            System.out.println("to'g'ri");
        } else {
//            System.out.println("noto'g'ri");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("birchi son: ");
        int birchi = sc.nextInt();
        System.out.print("ikkinchi son: ");
        int ikkinchi = sc.nextInt();
        if (birchi >= ikkinchi) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
