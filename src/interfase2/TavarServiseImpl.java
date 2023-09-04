package interfase2;

import java.util.Scanner;

public class TavarServiseImpl implements TavarServise{
    TavarModel[] tavarModels = new TavarModel[100];
    Scanner sc = new Scanner(System.in);

    int id = 0;
    @Override
    public void add() {
        System.out.print("Maxsulot nomini kiriting: ");
        String name = sc.next();
        System.out.print("Maxsulot narxini kiriting: ");
        int prise = sc.nextInt();
        System.out.print("Maxsulot sonini kiriting: ");
        int count = sc.nextInt();
        tavarModels[id] = new TavarModel(id,name,prise,count);
        id++;
        System.out.println("Malumot muovfaqiyatli qo'shildi!");
    }

    @Override
    public void all() {
        for (TavarModel tavarModel : tavarModels) {
            if (tavarModel!=null) {
                System.out.println(tavarModel);
            }
        }
    }

    @Override
    public void edit(int id) {
        System.out.println("Nomini o'zgartiring: ");
        String name = sc.nextLine();
        tavarModels[id].setName(name);
        String a = "hjewiufwjd";
        String b = "10";
        int d = Integer.parseInt(b);
    }

    @Override
    public void delit(int id) {
        tavarModels[id].setName("");
        tavarModels[id].setPrise(0);
        tavarModels[id].setCount(0);

    }
}
