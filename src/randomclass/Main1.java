package randomclass;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = a + b ;
        System.out.println(a+"+"+b+"="+c);

    }
}
