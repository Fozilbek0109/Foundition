package lesson12massive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] massive = {"Javohior","javlon","Asror","Abdulaziz","Asadbek"};
        for (String s : massive) {
            System.out.print("Ro'yhadan o'tganmisiz tekshiring: ");
           if (s.equalsIgnoreCase("Asror")){
               System.out.println(s + " Siz ro'yhatdan o'tgansiz");
           }else {
               System.out.println("Siz ro'yhatdan o'tmagansiz");
           }
        }
        for (int i = 0; i < massive.length; i++) {
//            System.out.println(massive[i]);
        }
     }
}
