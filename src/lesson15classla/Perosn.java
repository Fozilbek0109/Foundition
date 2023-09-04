package lesson15classla;

import java.util.Scanner;

public class Perosn {

    String name;
    String fname;
    int age;
    Scanner sc = new Scanner(System.in);


    public void show(String name1, String fname1, int age1) {
        name = name1;
        fname = fname1;
        age = age1;
    }

    public void person() {
        System.out.println(name + " " + fname + " " + age);
    }

    public void person2(String name, String fname, int age) {
        System.out.println("ismi: " + name + " familyasi: " + fname + " yoshi: " + age);
    }

    public void salomlash() {
        System.out.print("Ism kirting: ");
        String name = sc.next();
        System.out.println(name + " Assalomu alikum");
    }

    public Perosn object(){
        Perosn perosn = new Perosn();
        return perosn;
    }
}
