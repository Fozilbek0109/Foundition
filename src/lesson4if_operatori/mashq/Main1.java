package lesson4if_operatori.mashq;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinchi sonni kirit: ");
        int a = sc.nextInt();
        System.out.println("ikkinchi sonni kirit: ");
        int b = sc.nextInt();
        System.out.println("uchinchi sonni kirit: ");
        int c = sc.nextInt();
        // 1999  / 1000
        //1999 % 1000 / 100
        // 1999 % 1000 = 999 % 100 == 99 /10 = 9




        if (a == b){
            int ming = c / 1000;
            int yuz = c % 1000 / 100;
            int onlik = c % 1000 % 100 / 10;
            int birlik = c % 1000 % 100 % 10;
            System.out.println("birinchi raqam: " + ming);
            System.out.println("ikkiinchi raqam: " + yuz);
            System.out.println("uchinchi raqam: " + onlik);
            System.out.println("to'rtinchi raqam: " + birlik);
        }
        if (c == b){
            int ming = a / 1000;
            int yuz = a % 1000 / 100;
            int onlik = a % 1000 % 100 / 10;
            int birlik = a % 1000 % 100 % 10;
            System.out.println("birinchi raqam: " + ming);
            System.out.println("ikkiinchi raqam: " + yuz);
            System.out.println("uchinchi raqam: " + onlik);
            System.out.println("to'rtinchi raqam: " + birlik);
        }

        if (a == c){
            int ming = b / 1000;
            int yuz = b % 1000 / 100;
            int onlik = b % 1000 % 100 / 10;
            int birlik = b % 1000 % 100 % 10;
            System.out.println("birinchi raqam: " + ming);
            System.out.println("ikkiinchi raqam: " + yuz);
            System.out.println("uchinchi raqam: " + onlik);
            System.out.println("to'rtinchi raqam: " + birlik);
        }else {
            System.out.println("Ikkita son o'zaro teng bo'lishi kerak");
        }

    }
}
