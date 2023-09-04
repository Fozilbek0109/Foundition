package dowhile.whil;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int k = 5;
        int c = k;
        int but = 0;
        while (k < n) {   // 23  /  5 = 4   23 % 5 = 3     k += c  4
            k += c;
            but++;
        }
        System.out.println("butun qismi: " + but );
        while (k < n){  // 23 - 5 = 4 < 5
            if (n - k < c){

            }
        }
    }
}
