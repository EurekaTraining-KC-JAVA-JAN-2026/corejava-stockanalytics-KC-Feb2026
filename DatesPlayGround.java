import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("DATE using new keyword " + date);
        LocalDate localdate = LocalDate.now();
        System.out.println("DATE using localDate " + localdate);
        System.out.println(localdate.getDayOfMonth());
        System.out.println(localdate.getDayOfWeek());
        System.out.println(localdate.getDayOfYear());
        System.out.println("Going past in time by 3 days " + localdate.minusDays(3));
        System.out.println("Going future in time by 3 months" + localdate.plusMonths(3));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        //System.out.println(localdate.toEpochDay());
        //System.out.println(localdate.toEpochSecond(LocalTime.));

    }
}