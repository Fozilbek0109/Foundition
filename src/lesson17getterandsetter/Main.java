package lesson17getterandsetter;

public class Main {
    public static void main(String[] args) {
        Trasport trasport = new Trasport("Cobalt", 4, "chevrolet", 2020);
        System.out.println(trasport);
        trasport.setName("Kobralet");
        trasport.setYili(2023);




        //    System.out.println(trasport);
        String name = trasport.getName();
        System.out.println(trasport);


    }
}
