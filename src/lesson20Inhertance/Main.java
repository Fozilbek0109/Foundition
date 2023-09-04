package lesson20Inhertance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cobolat","Chevrolet",2021,150);
        System.out.println("Bu Mashina Malumotlari: "+ car);
        Veloseped veloseped = new Veloseped("Aist", "Ural", 2005, 30);
        System.out.println("Bu Veloseped Malumotlari: " +veloseped);
    }
}
