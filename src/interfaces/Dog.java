package interfaces;

public class Dog extends Animal implements Metodos ,Metodos1,Metodos2 {
    public Dog(String name, int age) {
        super(name, age);
    }
    public   final String NAME = "kewfnwiuk";   // o'zgarmas  yoki constanta

    @Override
    public void vois() {
    }

    @Override
    public void vois(int a) {

    }

    @Override
    public void vois(int a, int b) {

    }
}
