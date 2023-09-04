package lesson21.polimarfizm;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.buMisol(15);
        main.buMisol("drgdd");
        System.out.println("===================down casting============================");
        Object o = "15";   //
        String a =  (String) o;
        System.out.println(a);

        System.out.println("==========================up casting========================");
        String a1 = "Java";
        Object o1 = a1;
        System.out.println(o1);
        System.out.println("-------------------------------------------------------------");
        double son = 16.7;
        int kasr = (int) son;
        System.out.println("bu int: " +kasr);

    }

    public void buMisol(String a){

    }

    public void buMisol(int a){

    }




}
