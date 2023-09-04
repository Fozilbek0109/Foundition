package lesson12massive;

import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sozlarToplami = new  String[5];
        for (int i = 0; i <sozlarToplami.length ; i++) {
            System.out.print("so'z kiriting: ");
            sozlarToplami[i] = sc.next();
        }
        System.out.println(Arrays.toString(sozlarToplami));
    }
}
