package lesson13metodlar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Main main = new Main();
        Main.myMetod();
        Main.myMetod1("Javohir");
        System.out.println("_________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.print("birinchi sonni kiriting: ");
        int a = sc.nextInt();
        System.out.print("ikkinchi  sonni kiriting: ");
        int b = sc.nextInt();
        int plus = Main.plus(a, b);  //  a+ b;
        System.out.println(plus);


    }


    public static void myMetod() {
        System.out.println("hello");
    }
    public static void myMetod1(String str){
        String a = "salom";
        System.out.println(a + str);

    }


    public static int plus(int a , int b){
        int c = a + b ;
        return  c;
    }



}
