package lesson5switchoperatori;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1->Ditsimet\n2-> kilometr\n3-> metr \n 4-> millimetr\n5-> santimetr");
        int tanlash = sc.nextInt();
        switch (tanlash){
            //  10  ,   20/ 10 = 2  30 / 10 = 3 dit
            // 1 * 1000 = 1000 met 2 * 1000
            // 10 1 sm  1
            case 1:
                System.out.println("Ditsimetrni kiriting");
                double ditsimetr = sc.nextInt();
                double metr = ditsimetr / 10 ;
                System.out.println(metr+" metr");
                break;
            case 2:
                System.out.println("Kilometr kiriting");
                int kilometr = sc.nextInt();
                int metr1 = kilometr * 1000 ;
                System.out.println(metr1+" metr");
                break;
            case 3:
                System.out.println("metr kiriting");
                int metr2 = sc.nextInt();
                System.out.println(metr2+" metr");
                break;
            case 4:
                System.out.println("Millimetr kiriting");
                double millimetr = sc.nextInt();
                double metr3 = millimetr / 1000 ;
                System.out.println(metr3+" metr");
                break;
            case 5:
                System.out.println("Santi metr kiriting");
                double santimetr = sc.nextInt();
                double metr4 = santimetr / 100 ;
                System.out.println(metr4+" metr");
                break;
            default:
                System.out.println("xato");

        }
    }
}
