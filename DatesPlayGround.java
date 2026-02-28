import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {
    static void main() {
        Date date = new Date();
        System.out.println( " Date using new keyword"+date);
        LocalDate localDate = LocalDate.now();
        System.out.println("Date using local date"+localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.minusDays(3));
        System.out.println("going future in time by 3 months"+localDate.minusMonths(3));
        System.out.println(localDate.toEpochDay());
        System.out.println(localDate.plusMonths(3));
//        System.out.println(localDate.toEpochSecond(LocalTime.now(),zone));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
