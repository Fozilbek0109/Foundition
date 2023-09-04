package lesson13metodlar;

public class Main6 {
    public static void main(String[] args) {
        int result = Main6.sum(10);
        System.out.println(result);

    }


    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}