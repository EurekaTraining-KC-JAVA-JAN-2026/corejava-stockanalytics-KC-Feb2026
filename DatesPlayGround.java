import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date using new keyword: " +date);
        LocalDate localDate =LocalDate.now();
        System.out.println("Date using a keyword LocalDate: "  + localDate);
        System.out.println(localDate.getDayOfMonth()+" "+localDate.getDayOfWeek()+" "+localDate.getDayOfYear());
        System.out.println("Going past in time by 3 days: "+ localDate.minusDays(3));
        System.out.println("Going past in time by 3 months: "+ localDate.minusMonths(3));
        System.out.println("Going past in time by 3 years"+ localDate.minusYears(3));
        //System.out.println(localDate.toEpochDay());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
