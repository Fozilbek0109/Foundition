package lessson6Forsiklaperatori;

public class Main1 {
    public static void main(String[] args) {
        int narx = 5000;
        int summa = 0;
        for (int kg = 1 ; kg <= 10 ; kg++){
            summa = narx * kg;   //  narx = 5000 * 1 // 5000 = 5000 * 2 // 10000 = 10000 *3  // 30000 = 30000 * 4
            System.out.println(kg + "kg " + summa + " so'm" );
        }
    }
}
