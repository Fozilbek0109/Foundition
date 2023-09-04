package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1->qoshish\n2->ayrish\n3->ko'paytirish\n4-bo'lish");
        int tanlash = sc.nextInt();
        if (tanlash == 1){
            System.out.println("Birinchi son");
            a = sc.nextInt();
            System.out.println("ikkinchi son");
            b = sc.nextInt();
            c = a + b;
            System.out.println("Natija:" +c);
        } else if (tanlash == 2) {
            System.out.println("Birinchi son");
            a = sc.nextInt();
            System.out.println("ikkinchi son");
            b = sc.nextInt();
            c = a - b;
            System.out.println("Natija:" +c);
        }else {
            System.out.println("tanlashda xotolik");
        }
    }
}
