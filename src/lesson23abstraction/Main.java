package lesson23abstraction;

public class Main {
    public static void main(String[] args) {
//       Animal animal = new Dog("To'zik",3);
//        animal.vois();
//        System.out.println(animal);
//        Animal animal1 = new Cat("Mushuk" ,2);
//        animal1.vois();
//        System.out.println(animal1);
//        Animal animal2 = new Cow("Sigir" ,4);
//        animal2.vois();
//        System.out.println(animal2);
//
//        Animal[] animals = new Animal[20];
//

        Dog dog = new Dog("reks",3);
        Dog dog1 =dog;
        System.out.println(dog.hashCode());
        System.out.println(dog1.hashCode());
        System.out.println(dog == dog1);
        System.out.println(dog.equals(dog1));

    }
}
