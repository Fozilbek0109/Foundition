package lesson25Collection.collection_list;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            integerList.add(i);
        }

        for (int i = 0; i < integerList.size() ; i++) {
            if (integerList.get(i)%2 == 0){
                System.out.println(integerList.get(i) + " bu juft son");
            }else{
                System.out.println(integerList.get(i) + " bu toq son");
            }
        }

    }

}
