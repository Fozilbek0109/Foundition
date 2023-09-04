package lesson12massive;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sonlar = new int[10];
        for (int i = 0; i < sonlar.length ; i++) {
            int a = sc.nextInt();
            sonlar[i] = a;

        }
        System.out.println(Arrays.toString(sonlar));



    }
}
