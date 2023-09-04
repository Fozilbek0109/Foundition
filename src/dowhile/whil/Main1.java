package dowhile.whil;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double n1 = sc.nextDouble();
        while (n<=n1){
            n++;
            // 3  9  27
        }
        double sqrt = Math.sqrt(n);
        if (sqrt == 3){
            System.out.println("3 darajasi");
        }else {
            System.out.println("3 ning darajadsi emas");
        }
    }
}
