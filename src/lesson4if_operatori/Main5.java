package lesson4if_operatori;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //  196 / 100 =  1;
        // 123 % 100 = 23 /10 = 2
        // 123 % 100 = 23 % 10 = 3
        // 
        if (a > b) {
            int b1 = b / 100;
            int b2 = b % 100 / 10;
            int b3 = b % 100 % 10;
            System.out.println("birinchio raqam: " + b1);
            System.out.println("ikkinchi raqam: " + b2);
            System.out.println("uchinchi raqam: " + b3);
        } else {
            int a1 = a / 100;
            int a2 = a % 100 / 10;
            int a3 = a % 100 % 10;
            System.out.println("birinchio raqam: " + a1);
            System.out.println("ikkinchi raqam: " + a2);
            System.out.println("uchinchi raqam: " + a3);

        }
    }
}
