package lesson15classla.mashiqlar;

public class Transport {
    String name;
    String firName;
    int year;


    public Transport(String name,String firName,int year){
        this.name =name;
        this.firName = firName;
        this.year = year;
    }
    public  void  show(){
        System.out.println("Nopmi " +name);
        System.out.println("Firma nomi " + firName);
        System.out.println("Ishlab chiqarilgan yili " + year);

    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", firName='" + firName + '\'' +
                ", year=" + year +
                '}';
    }

    public  void  tezligi(double yol,double vaqt){
        System.out.println("tezligi " + yol / vaqt +" ga teng");
    }

}
