package while11;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        int n = sc.nextInt();
        int sum = 1;
        int count = 0;
        int i = 1;
        while (i <= n) {
           int m = 1;                     // 5
            while (m <= i) {
                sum *= m;                                    // 1*1  // 2! = 1*2   // 3! = 1*2*3 = 6
                m++;
            }
            count += sum;     // 1 + 2 + 6 =9
            i++;
        }
        System.out.println(count);
    }
}
