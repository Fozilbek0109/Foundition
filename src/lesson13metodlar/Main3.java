package lesson13metodlar;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Main3 main3 = new Main3();
        Scanner sc = new Scanner(System.in);
        main3.person("Fozilbek","Karimov",22);
        System.out.println(main3.person1("Ruslan", "Jumaboyev", 13));


    }
    public void person(String name,String fName,int age){
        System.out.println("ismi "+name+" Familyasi " + fName + " yoshi " +age );

    }
    public String person1(String name,String fName, int age){
        return "ismi " + name+" Familyasi " + fName + " yoshi " + age;
    }






}
