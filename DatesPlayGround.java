import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {

    public static void main(String args[]) {

        Date date = new Date();
        System.out.println("Using new keyword" + date);

        LocalDate localDate = LocalDate.now();
        System.out.println("Date using local Date : " + localDate);

       System.out.println(localDate.getDayOfMonth());
        System.out.println( localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

       System.out.println("Going past in time by threee days : " + localDate.minusDays(3));
       System.out.println("Going future in time by months:" + localDate.plusMonths(3));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


      //System.out.println(localDate.toEpochDay());
      //System.out.println(localDate.toEpochSecond(LocalTime.from(localDate.now()), ZoneOffset.of(String.valueOf(2))));

    }

}
