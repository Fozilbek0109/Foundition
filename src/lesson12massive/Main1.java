package lesson12massive;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        // Array
        int[] sonlar = new int[5]; //  length
        sonlar[0] = 45; //
        sonlar[1] = 88;
        sonlar[2] = 100;
        sonlar[3] = 66;
        sonlar[4] = 115;
        System.out.println(Arrays.toString(sonlar));


        for (int i = 0; i < sonlar.length ; i++) {
            System.out.println(sonlar[i]);
        }

        sonlar[2] = 55;
        System.out.println(Arrays.toString(sonlar));
    }
}
