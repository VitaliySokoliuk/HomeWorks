package homework_25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Data_Time {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date);
        System.out.println("LocalDate: " + DatetoLocalDate(date));
        System.out.println("LocalTime: " + DateToLocalTime(date));
        System.out.println("LocalDateTime: " + DatetoLocalDateTime(date));
    }

    public static LocalDate DatetoLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime DateToLocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime DatetoLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
