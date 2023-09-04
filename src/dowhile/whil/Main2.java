package dowhile.whil;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("amalni tanlang\n1->bo'lish /\n2->ko'paytirish *\n3->Qo'shish +\n4->Ayirish - \n 5- daraja");
            int amal = sc.nextInt();
            switch (amal){
                case 1:
                    System.out.println("birinchi sonni kiriting");
                    double a = sc.nextDouble();
                    System.out.println("ikkinchi sonni kiriting");
                    double b = sc.nextDouble();
                    double c = a / b;
                    System.out.println("natija "+ c);
                    break;
                case 2:
                    System.out.println("birinchi sonni kiriting");
                    double a1 = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    double c1 = a1 * b1;
                    System.out.println("natija "+ c1);
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
