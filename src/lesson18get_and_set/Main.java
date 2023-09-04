package lesson18get_and_set;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users[] users = new Users[5];
       users[0] = new Users("sssss@gmail.com",1111,"sssss");
       users[1] = new Users("ddddd@gmail.ru",2222,"dddd");
       users[2] = new Users("asas@gmail.com",0000,"asas");
       users[3] = new Users("ffaa@gmail.com",5555,"ffaa");
       users[4] = new Users("uzmid@gmail.uz",0101,"uzmid");
        System.out.println(Arrays.toString(users));
        System.out.print("emailni kirting: ");
        String email = sc.next();
        System.out.print("password kirting: ");
        int password = sc.nextInt();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getEmail().equalsIgnoreCase(email) && users[i].getPassword() == password){
                System.out.println("Hush kelibsiz");
            }else {
                System.out.println("Siz ro'yhatdan o'tmagansiz");
            }

        }



    }
}
