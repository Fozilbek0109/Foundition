package lesson4if_operatori;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("a "+a);
        }else {
            System.out.println("b "+b);
        }
    }
}
