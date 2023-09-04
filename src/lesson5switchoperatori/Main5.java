package lesson5switchoperatori;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Robot qaysi tamonga qarab turibdi:\ns->shimol\nj->janub\ng->g'arb\nsh->Sharq ");
        String tamon = sc.next();

        switch (tamon){
            case "s":
                System.out.println("0->harakatni davom ettir\n1->chapga\n2->o'nga\n3->ortga");
                int tanlash = sc.nextInt();
                switch (tanlash){
                    case 0:
                        System.out.println("Robot shimolga qarab turibdi");
                        break;
                    case 1:
                        System.out.println("Robot G'arbga qarab turibdi");
                        break;
                    case 2:
                        System.out.println("Robot Sharqqa qarab turibdi");
                        break;
                    case 3:
                        System.out.println("Robot Janub qarab turibdi");
                        break;
                    default:
                        System.out.println("xato");
                }
                break;
            case "j":
                System.out.println("0->harakatni davom ettir\n1->chapga\n2->o'nga\n3->ortga");
                int tanlash1 = sc.nextInt();
                switch (tanlash1) {
                    case 0:
                        System.out.println("Robot Janubga qarab turibdi");
                        break;
                    case 1:
                        System.out.println("Robot Sharq qarab turibdi");
                        break;
                    case 2:
                        System.out.println("Robot G'arbga qarab turibdi");
                        break;
                    case 3:
                        System.out.println("Robot Shimol qarab turibdi");
                        break;
                    default:
                        System.out.println("xato");
                }
                break;
            case "g":
                break;
            case "sh":
                break;
        }

    }

}

