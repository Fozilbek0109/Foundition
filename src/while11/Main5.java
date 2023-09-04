package while11;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sonni kiriting: ");
        int n = sc.nextInt();
        int sum = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {    // i =   3
            for (int m = 1; m <= i ; m++) {   // 3 / 1 , 2 , 3
                sum *= m;
            }
            count += sum;
        }
        System.out.println(count);
    }
}
