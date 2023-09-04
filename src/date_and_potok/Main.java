package date_and_potok;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println(dateTimeFormatter);
        String format = dateTime.format(dateTimeFormatter);
        System.out.println(format);
    }

}
