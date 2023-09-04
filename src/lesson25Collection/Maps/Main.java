package lesson25Collection.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("salom","hello");
        stringMap.put("kitob","book");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(stringMap.get(s));


//        stringMap.replace(1,"php","python");
//        System.out.println(stringMap);
//        Collection<Integer> values = stringMap.keySet();
//        System.out.println(values);

    }



}
