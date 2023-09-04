package lessson6Forsiklaperatori;

public class Main11 {
    public static void main(String[] args) {
//        double count = 0;
//      for (int n = 1; n < 8 ; n++){
//          double pow = Math.pow(n, n);
//          count += pow;
//
//      }
//        System.out.println(count);

        int n = 10;
        int m = 1;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {

            double pow = Math.pow(m, n);
            n--;
            m++;
            sum+=pow;
        }
        System.out.println(sum);

    }
}
