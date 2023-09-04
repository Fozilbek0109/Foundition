package while11;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = 1;
            int sum = 0;
            System.out.print("nichanchi darajagacha bilmoqchisiz: ");
            int n = sc.nextInt();
            System.out.print("qaysi sonni darajaga kotarmoqchisiz: ");
            int a = sc.nextInt();   // 5   5 1
            while (i <= n) { // n = 5   1 ,2 3 4 5
                double pow = Math.pow(a, i);
                sum += pow;
                i++;
            }
            System.out.println(sum);
        }
    }
}
