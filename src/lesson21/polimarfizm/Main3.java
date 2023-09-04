package lesson21.polimarfizm;

public class Main3 {
    public static void main(String[] args) {
        Object o = 15;

        if (o instanceof String){
            String s = (String) o;
            System.out.println("Bu string: " +s);
        } else if (o instanceof  Integer) {
            int i = (int) o;
            System.out.println("bbu int " +i);
        } else if (o instanceof  Double) {
            double d = (double) o;
            System.out.println("bu double " +d);
        }


    }
}
