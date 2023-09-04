package lesson17getterandsetter;

 class Trasport {
    private  String name;
     private int balonlarSoni;
     private String firmasi;
     private  int yili;

    public Trasport(String name,int balonlarSoni,String firmasi,int yili){
        this.name = name;
        this.balonlarSoni = balonlarSoni;
        this.firmasi = firmasi;
        this.yili = yili;
    }
    public Trasport(){}

    @Override
    public String toString() {
        return "Trasport{" + "name='" + name + '\'' +
                ", balonlarSoni=" + balonlarSoni +
                ", firmasi='" + firmasi + '\'' +
                ", yili=" + yili +
                '}';
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getBalonlarSoni() {
         return balonlarSoni;
     }

     public void setBalonlarSoni(int balonlarSoni) {
         this.balonlarSoni = balonlarSoni;
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
 }
