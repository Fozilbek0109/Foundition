package lesson5switchoperatori;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Tanlang \n 1-kun \n 2-kun  \n 3-kun \n 4-kun \n 5-kun \n 6-kun \n 7-kun ");
        int tansh = sc.nextInt();
        switch (tansh){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
            case 7:
                System.out.println("Yakshanba");
                break;
            default:
                System.out.println("Bundaya Hata Mavjud emas");

        }




    }
}
