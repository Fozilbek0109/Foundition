package lessson6Forsiklaperatori;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n ; i++) {
            double pow = Math.pow(i, k);
            sum += pow;
        }
        System.out.println(sum);

    }
}
