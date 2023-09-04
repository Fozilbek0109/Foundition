package filellar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Fundution.txt");
        if (!(file.exists())){
            file.createNewFile();
        }

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        bufferedWriter.newLine();

        bufferedWriter.append("wedewdewdew");
        bufferedWriter.flush();
        bufferedWriter.close();





    }
}
