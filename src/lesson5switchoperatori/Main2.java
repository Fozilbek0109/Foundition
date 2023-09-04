package lesson5switchoperatori;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nechinchi oy raqamini kiriting: ");
        int t = sc.nextInt();
        switch (t){
            case 1,2,3:
                System.out.println("Qish");
                break;
            case 4,5,6:
                System.out.println("Baxor");
                break;
            case 7,8,9:
                System.out.println("Yoz");
                break;
            case 10,11,12:
                System.out.println("Kuz");
                break;
            default:
                throw new IndexOutOfBoundsException("Bunday oy yo'q : " + t);
        }
    }
}
