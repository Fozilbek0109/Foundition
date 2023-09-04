package lesson12massive;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        char[] belgilar = new char[8];
        belgilar[0] = 'F';
        belgilar[1] = 'o';
        belgilar[2] = 'z';
        belgilar[3] = 'i';
        belgilar[4] = 'l';
        belgilar[5] = 'b';
        belgilar[6] = 'e';
        belgilar[7] = 'k';
        System.out.println(belgilar[3]);
        for (int i = 0; i < belgilar.length ; i++) {
            System.out.println(belgilar[i]);

        }
        System.out.println(Arrays.toString(belgilar));
        String ism = String.valueOf(belgilar);
        System.out.println(ism);





    }
}
