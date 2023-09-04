package lesson20Inhertance;

public class Car extends Transport {
    private int tezlik;

    public Car(String name, String firmasi, int yili, int tezlik) {
        super(name, firmasi, yili);
        this.tezlik = tezlik;
    }

    public int getTezlik() {
        return tezlik;
    }

    public void setTezlik(int tezlik) {
        this.tezlik = tezlik;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tezlik=" + tezlik +
                 super.toString();
    }

    @Override
    public void tezligi() {

    }


}

