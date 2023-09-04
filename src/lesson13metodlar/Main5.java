package lesson13metodlar;

public class Main5 {
    String name;
    String fname;
    String age;

    public static void main(String[] args) {
        Main5 main5 = new Main5();
        main5.show1("Fozilbek","Karimov","22");

//        main5.show2();
        String show = main5.getShow();
        System.out.println(show);

    }
    public void show1(String name,String fname,String age){
        this.name = name;
        this.fname = fname;
        this.age = age;
    }

    public void show2(){
        System.out.println(name+" " + fname +" "+ age);
    }

    public String getShow(){
        return name + " "+ fname +" " + age;
    }




}
