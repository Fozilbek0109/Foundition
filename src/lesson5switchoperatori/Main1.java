package lesson5switchoperatori;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ ->Qo'shish\n- ->ayirish\n* ->Ko'patirish\n/ -Bo'lish");
        String tanlash = sc.next();
        int a;
        int b;
        int count;

        switch (tanlash){
            case "+":
                System.out.println("Birinchi sonni kiriting");
                 a = sc.nextInt();
                System.out.println("ikkinchi sonni kiriting");
                 b = sc.nextInt();
                 count = a + b ;
                System.out.println("Natija: "+count);
                break;
            case "-":
                System.out.println("Birinchi sonni kiriting");
                a = sc.nextInt();
                System.out.println("ikkinchi sonni kiriting");
                b = sc.nextInt();
                count = a - b ;
                System.out.println("Natija: "+count);
                break;
            case "*":
                System.out.println("Birinchi sonni kiriting");
                a = sc.nextInt();
                System.out.println("ikkinchi sonni kiriting");
                b = sc.nextInt();
                count = a * b ;
                System.out.println("Natija: "+count);
                break;
            case "/":
                System.out.println("Birinchi sonni kiriting");
                double c = sc.nextInt();
                System.out.println("ikkinchi sonni kiriting");
                double d = sc.nextInt();
                double natija = c / d ;
                System.out.println("Natija: "+natija);
                break;
            default:
                System.out.println("Bunday amal yo'q");
        }
    }
}
