package lesson13metodlar;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int plus = Main2.plus(10, 25);   // 35
        System.out.println(plus);
        System.out.println("=======================================");
        System.out.println(Main2.plus(45,75));
        String salom = Main2.salom("Fozilbek");
        System.out.println(salom);
        System.out.println("=====================================");
        Scanner sc=new Scanner(System.in);
        String i = sc.next();
        String yay = sc.next();
        String s = Main2.makeTags(i, yay);
        System.out.println(s);
        System.out.println("===============================");
        System.out.println(Main2.makeTags(i, yay));


    }
    public static int plus(int a ,int b){
        return a+b;         //
    }
    public static String salom(String malumot){
        String s = "Assalomu alikum "+malumot;


        return s;
    }

    public static String makeTags(String i, String yay){
        return "<"+i+">"+yay+"</"+i+">";
    }





}
