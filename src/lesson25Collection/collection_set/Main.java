package lesson25Collection.collection_set;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(45);
        integerSet.add(79);
        integerSet.add(12);
        integerSet.add(95);
        integerSet.add(95);
        integerSet.add(45);
        integerSet.add(0);
        integerSet.add(3);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Javlon");
        stringSet.add("Rashid");
        stringSet.add("Bobur");
        stringSet.add("Bobur");
        stringSet.add("Kamola");
        stringSet.add("Anvar");
        stringSet.add("Anvar");
        stringSet.remove("Anvar");
        stringSet.forEach(s-> System.out.println(s));


//        System.out.println(stringSet);
//        List<String> stringList = new ArrayList<>();
//        stringList.addAll(stringSet);
//        System.out.println(stringList);
//        System.out.println(stringList.get(2));

    }
}
