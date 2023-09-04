package lesson4if_operatori.mashq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinchi sonni kiriting: ");
        int a = sc.nextInt();
        System.out.print("Birinchi sonni kiriting: ");
        int b = sc.nextInt();
        System.out.print("Birinchi sonni kiriting: ");
        int c = sc.nextInt();
        if (a < b && b < c ){
            System.out.println("a: " + a*2);
            System.out.println("b: " + b*2);
            System.out.println("c: " + c*2);

        }else {
            System.out.println(-a);
            System.out.println(-b);
            System.out.println(-c);
        }
    }
}
