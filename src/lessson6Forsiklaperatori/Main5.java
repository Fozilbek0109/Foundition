package lessson6Forsiklaperatori;

public class Main5 {
    public static void main(String[] args) {
        double narx = 1000;
        double summa = 0;
        for (double kg = 1.2; kg <= 2 ; kg += 0.1) {
            summa = kg * narx;
            System.out.println(summa);
        }



    }
}
