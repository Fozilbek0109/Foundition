package interfase2;

public class TavarModel {
    private int id;
    private String name;
    private int prise;
    private int count;

    public TavarModel(int id, String name, int prise, int count) {
        this.id = id;
        this.name = name;
        this.prise = prise;
        this.count = count;
    }

    @Override
    public String toString() {
        return "TavarModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prise=" + prise +
                ", count=" + count +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
