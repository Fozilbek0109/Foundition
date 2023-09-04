package filellar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\strik\\OneDrive - IT PARK\\Рабочий стол\\Test.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hello java\n");

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            File file = new File("C:\\Users\\strik\\OneDrive - IT PARK\\Рабочий стол\\Test.txt");
            FileReader fileReader = new FileReader(file);
            int read;
            while ((read = fileReader.read()) != -1){
                System.out.print((char) read); // 111

            }
        } catch (IOException e) {
                throw new RuntimeException(e);
        }



    }


}
