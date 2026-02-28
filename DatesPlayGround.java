import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println("date missing keyword"+date);
        LocalDate localDate=LocalDate.now();
        System.out.println("date using localdate"+localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.minusDays(1));
        System.out.println("missing future time for one monts"+localDate.minusMonths(1));
//to find local time
        LocalTime localTime=LocalTime.now();
        System.out.println(localDate);

        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDate.toEpochDay());
//        System.out.println(localDate.toEpochSecond());

    }
}
