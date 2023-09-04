package lesson3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ismni kirt: ");
        String s = sc.next();
        if (s.equalsIgnoreCase( "111111")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
