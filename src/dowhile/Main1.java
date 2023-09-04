package dowhile;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A sonini kiriting: ");
        int a = sc.nextInt();
        System.out.print("B sonini kiriting: ");
        int b = sc.nextInt();
        int c = b;  //  b  = 5   ;   c = 5;
        int sum=0;
        do {
           b += c;   //5 += 5  = 10 + 5
           sum++;
        }while (b <= a);
        System.out.println(sum + " ta joylashtirsa bo'ladi");




    }
}
