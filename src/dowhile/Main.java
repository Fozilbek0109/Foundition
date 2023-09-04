package dowhile;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int sum=0;
        do {
            b++;
            sum++;
        }while (b < a);   //5 +1
        System.out.println(sum);


    }
}
