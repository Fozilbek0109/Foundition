package lesson4if_operatori;

public class Main2 {
    public static void main(String[] args) {
        int a = -1;
        if (a>0){
            a++;
            System.out.println(a);
        } else if (a==0) {
            a = 10;
            System.out.println(a);
        }else {
            a-=2;
            System.out.println(a);



        }
    }
}
