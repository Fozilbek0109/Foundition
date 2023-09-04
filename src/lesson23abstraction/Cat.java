package lesson23abstraction;

public class Cat extends Animal{
    public Cat(String laqabi, int age) {
        super(laqabi, age);
    }

    @Override
    public void vois() {
        System.out.println("Miov");
    }

    @Override
    public String toString() {
        return "Cat{ " + super.toString();
    }
}
