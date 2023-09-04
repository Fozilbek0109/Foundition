package lessson6Forsiklaperatori;



import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            double pow = Math.pow(i, 2);
            System.out.println(pow);
        }

    }
}
