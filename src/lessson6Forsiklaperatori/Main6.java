package lessson6Forsiklaperatori;

public class Main6 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;
        double count = 0;
        for (int i = 1; i < n; i++) {
            sum = Math.pow((n + i),2);
            count +=Math.pow(n,2) + sum;

            System.out.println(sum);
        }
        System.out.println(count);
    }
}
