package lesson13metodlar;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(main4.plus(a, b));

        int i = main4.miniMax(a, b);
        System.out.println(i + " soni katta");

    }

    public int plus(int a, int b) {
        return a + b;
    }

    public   int miniMax(int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }



}
