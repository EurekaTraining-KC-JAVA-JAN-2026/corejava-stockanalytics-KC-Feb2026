import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date); // using new keyword
        LocalDate  localDate = LocalDate.now();
        System.out.println(localDate); // using localdate
        localDate.getDayOfMonth();
        localDate.getDayOfWeek();
        localDate.getDayOfYear();
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        // going to the past
        System.out.println(localDate.minusDays(3));
        System.out.println(localDate.minusMonths(3));
        System.out.println(localDate.minusYears(3));
        // going to the future
        System.out.println(localDate.plusDays(3));
        System.out.println(localDate.plusMonths(3));
        System.out.println(localDate.plusYears(3));
        System.out.println(localDate.toEpochDay());

        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);

        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);



    }
}
