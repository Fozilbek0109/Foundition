package lesson23abstraction;

public class Dog extends Animal{
    public Dog(String laqabi, int age) {
        super(laqabi, age);
    }

    @Override
    public void vois() {
        System.out.println("Vov");
    }

    @Override
    public String toString() {
        return "Dog{ " + super.toString();
    }
}
