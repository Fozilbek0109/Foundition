package stringmetodlar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yozuv = "Salom java, hello java";
        System.out.println(yozuv.length());
        yozuv.equalsIgnoreCase("Salom java, hello java"); // yozuv = Salom java, hello java

//        int son = 10;
//        if (yozuv.equalsIgnoreCase("salom java, hello java")){
//            System.out.println("to'g'ri");
//        }else {
//            System.out.println("xato");
//        }
//        System.out.println(Arrays.toString(yozuv.split("Salom java")));
//        System.out.println(yozuv.toUpperCase());
//        System.out.println(yozuv.toLowerCase());
//        System.out.println(yozuv.length());
//        System.out.println(yozuv.indexOf("a", 5));
//
//        boolean malumot = yozuv.isEmpty();
//        System.out.println(malumot);
//
//        if (yozuv.isEmpty()) {
//            System.out.println("malumot yo'q");
//        }else {
//            System.out.println("malumot bor");
//        }
//        int a = 10;
//        System.out.println(yozuv.charAt(6));
//        System.out.println(yozuv.lastIndexOf("v"));
//        System.out.println(yozuv.repeat(3));
//        String a1 = String.valueOf(a);
//        System.out.println(a1);
//        System.out.println(Arrays.toString(yozuv.toCharArray()));
        Scanner scanner = new Scanner(System.in);
        String name = "Fozilbek";
        String name1= scanner.next();
        if (name1.equalsIgnoreCase(name)){
            System.out.println("hush kelibsiz");
        }
        else {
            System.out.println("xato");
        }



    }
}
