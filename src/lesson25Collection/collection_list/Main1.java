package lesson25Collection.collection_list;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("java");
        stringList.add("kotlin");
        stringList.add("Android");
        System.out.println(stringList);
        System.out.println(stringList.get(1));
        System.out.println(stringList.size());
        List<String> strings = new ArrayList<>();
        strings.add("sssssss");
        strings.add("aaaaaaa");
        strings.add("gggggggg");
        strings.add("dddddddddd");
        stringList.addAll(1,strings);
        boolean b = stringList.containsAll(strings);
        System.out.println(b);
        System.out.println(stringList);
        stringList.set(3,"salom");
        System.out.println(stringList);
    }
}
