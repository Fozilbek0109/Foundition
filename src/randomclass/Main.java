package randomclass;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int togri = 0;
        int notogri = 0;
        for (int i = 0; i < 100 ; i++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int c = a+b;
            System.out.print(a+"+"+b+"=");
            int javob = sc.nextInt();
            if (javob == c){
                System.out.println("Javobingiz to'g'ri");
                togri++;
            }else {
                System.out.println("Javobingiz noto'g'ri");
                notogri++;
            }
            System.out.println("To'gri javoblar soni: "+togri+"\n"+"Noto'g'ri javoblar: " + notogri);
        }



    }
}
