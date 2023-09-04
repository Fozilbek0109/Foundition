package lesson12massive;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] belgilar = new char[15];
        belgilar[0] = 'k';
        belgilar[1] = 'h';
        belgilar[2] = 'i';
        belgilar[3] = 'j';
        belgilar[4] = 'r';   // 4 6 2 10 7 8 3 ;
        belgilar[5] = 'g';
        belgilar[6] = 's';
        belgilar[7] = 'd';
        belgilar[8] = 'k';
        belgilar[9] = 'l';
        belgilar[10] = 'a';
        belgilar[11] = 'b';
        belgilar[12] = 'x';
        belgilar[13] = 'l';
        belgilar[14] = 'r';
        Arrays.sort(belgilar);
        System.out.println(Arrays.toString(belgilar));
        String[] sortMassive =  {"Javohir","Begzod","Jamshid","Anvar","Kamol","Aziz"};
        Arrays.sort(sortMassive);
        System.out.println(Arrays.toString(sortMassive));


    }
}
