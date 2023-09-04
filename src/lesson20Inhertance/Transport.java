package lesson20Inhertance;

public abstract class Transport {
    private String name;
    private String firmasi;
    private int yili;

    public Transport(String name, String firmasi, int yili) {
        this.name = name;
        this.firmasi = firmasi;
        this.yili = yili;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirmasi() {
        return firmasi;
    }

    public void setFirmasi(String firmasi) {
        this.firmasi = firmasi;
    }

    public int getYili() {
        return yili;
    }

    public void setYili(int yili) {
        this.yili = yili;
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", firmasi='" + firmasi + '\'' +
                ", yili=" + yili +
                '}';
    }


    public abstract  void  tezligi();
}
