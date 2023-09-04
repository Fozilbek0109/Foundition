package lesson12massive;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        char[] belgilar = new char[8];
        belgilar[0] = 'a';
        belgilar[1] = 'b';
        belgilar[2] = 'c';
        belgilar[3] = 'd';
        belgilar[4] = 'e';
        belgilar[5] = 'f';
        belgilar[6] = 'g';
        belgilar[7] = 'h';
        char[] copy = new char[4];
        System.arraycopy(belgilar,2,copy,0,4);  // 1
        System.out.println(Arrays.toString(copy));


    }
}
