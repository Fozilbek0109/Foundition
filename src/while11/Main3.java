package while11;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("sonni kiriting");
            int n = sc.nextInt();
            int i = 1;
            int sum = 1;
            while (i <= n) {
                sum *= i;
                i++;

            }
            System.out.println(sum); // 1*2*3*4*5*6*7*8*9*10*11*12
        }
    }
}
