package lesson23abstraction;

public class Cow extends  Animal{

    public Cow(String laqabi, int age) {
        super(laqabi, age);
    }

    @Override
    public void vois() {
        System.out.println("Muuu");
    }

    @Override
    public String toString() {
        return "Cow{ " + super.toString();
    }
}
