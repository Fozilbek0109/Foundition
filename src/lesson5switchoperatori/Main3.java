package lesson5switchoperatori;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("oy raqamini kiriting");
        int t = sc.nextInt();

        switch (t){
            case 1,3,5,7,9,11:
                System.out.println("31-kun");
                break;
            case 4,6,8,10,12:
                System.out.println("30-kun");
                break;
            case 2:
                System.out.println("28-29-kun");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + t);
        }
    }
}
