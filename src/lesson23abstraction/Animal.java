package lesson23abstraction;

public abstract class Animal {

    private String laqabi;
    private int age;


    public Animal(String laqabi, int age) {
        this.laqabi = laqabi;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "laqabi='" + laqabi + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLaqabi() {
        return laqabi;
    }

    public void setLaqabi(String laqabi) {
        this.laqabi = laqabi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void vois();


}
