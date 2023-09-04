package exseptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            System.out.println(a / 0);
        } catch (Exception e) {
           e.printStackTrace();
        }
            System.out.println("Salom");
            int b = sc.nextInt();
            System.out.println(b);
    }
}
