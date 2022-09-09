package Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDate {

    public static LocalDate stringToDate(String date){
        date = date.replace("-" , "/");
        date = "01/" + date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return  localDate;
    }

}
