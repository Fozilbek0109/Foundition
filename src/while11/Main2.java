package while11;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nichanchi darajagacha bilmoqchisiz: ");
        int n = sc.nextInt();
        System.out.print("qaysi sonni darajaga kotarmoqchisiz: ");
        int a = sc.nextInt();
        int juftSum = 0;
        int toqSum = 0;
        int i = 0;
        while (i <= n){
            double pow = Math.pow(a, i);  // 0  2   4   6  8
            juftSum += pow;                 // 1 3 5 7
            i++; //9
            if (i >= 8){
                break;
            }
            double pow1 = Math.pow(a, i);
            toqSum += pow1;
            i++;
        }
        System.out.println(juftSum);
        System.out.println(toqSum);
        System.out.println(juftSum - toqSum);


    }
}
