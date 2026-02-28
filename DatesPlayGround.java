import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Using new keyword"+date);
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("Date using localDate "+localDate);
        System.out.println("Time using localTime "+localTime);
        localDate.getDayOfMonth();
        localDate.getDayOfWeek();
        System.out.println("Going past in time by 3 days "+localDate.minusDays(3));
        System.out.println("Going past in time by 3 months "+localDate.plusMonths(3));
        System.out.println( localDate.toEpochDay());
        //System.out.println(localDate.toEpochSecond(LocalTime.now(), ZoneOffset.ofHours()));

    }
}
