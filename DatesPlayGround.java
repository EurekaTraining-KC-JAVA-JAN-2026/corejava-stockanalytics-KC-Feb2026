import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("using new keyword " +date);
        LocalDate localDate = LocalDate.now();
        System.out.println("Date using LocalDate "+localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println("Going past by 3 days "+localDate.minusDays(3));
        System.out.println("Going future by 3 months "+localDate.minusMonths(5));
//        System.out.println(localDate.toEpochDay());

    }
}
