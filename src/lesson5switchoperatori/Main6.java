package lesson5switchoperatori;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-> radius\n2-> Diametr\n3-> uzunlik \n4-> Doira yuzasi");
        int tanla = sc.nextInt();
        switch (tanla){
            case 1:
                System.out.println("radiusni kirting");
                double radius =sc.nextDouble();
                double d = radius*2;
                System.out.println("diametri: " +d);
                double u = 2*Math.PI*radius;
                System.out.println("uznligi: "+u);
                double y = Math.PI * Math.pow(radius,2);
                System.out.println("Doira yuza: "+ y);

                break;
            case 2:
                double diametr = sc.nextDouble();
                double r = diametr/2;
                break;
            case 3:
            double uzun = sc.nextDouble();
                break;
            case 4:
            double yuza = sc.nextDouble();
                break;

        }
    }
}
