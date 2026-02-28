import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayground {
   public static void main(String[] args) {
       Date date = new Date();
       System.out.println("using new keyword"+date);
       LocalDate localDate = LocalDate.now();
       System.out.println("DATE using local date"+localDate);
       System.out.println(localDate.getDayOfMonth());
       System.out.println(localDate.getDayOfWeek());
       System.out.println( localDate.getDayOfYear());
       System.out.println("Going past in time by 3 days"+localDate.minusDays(3));
       System.out.println("Going future in time by 3 months"+localDate.plusMonths(3));
       //System.out.println(localDate.toEpochDay());
       //System.out.println(localDate.toEpochSecond(LocalTime.now(),2));
       LocalTime localTime = LocalTime.now();
       System.out.println(localTime);
       LocalDateTime localDateTime = LocalDateTime.now();
       System.out.println(localDateTime);




    }
}
