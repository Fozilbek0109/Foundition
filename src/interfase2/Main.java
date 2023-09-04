package interfase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TavarServiseImpl tavarServise = new TavarServiseImpl();
        boolean b = true;
        while (b) {
            System.out.println("Tanlang:\n1->Tavar qo'shish\n2->Barcha Tavarlar\n3->Tavrni o'zgartirish\n4->Tavarni o'chirish");
            int tanlash = sc.nextInt();
            switch (tanlash) {
                case 1:
                    tavarServise.add();
                    break;
                case 2:
                    tavarServise.all();
                    break;
                case 3:
                    tavarServise.all();
                    System.out.print("Tavar idsini kiriting: ");
                    int id = sc.nextInt();
                    tavarServise.edit(id);
            }
        }


    }
}
