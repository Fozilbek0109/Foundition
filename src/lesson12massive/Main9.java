package lesson12massive;

public class Main9 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]  = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 8;
        a[4] = 20;
        for (int s : a) {
            if (s % 2 == 0){
                System.out.println("juft son " +s);
            }else {
                System.out.println("Toq son "+s);
            }
        }
    }
}
