import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("Using new Keyword "+ d1);
//        System.out.println(d1.getTime());
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        System.out.println(localdate.getDayOfMonth()+" "+localdate.getMonth()+" "+ localdate.getDayOfYear());

        System.out.println(localdate.minusDays(3));

        System.out.println(localdate.minusMonths(3));

        System.out.println(localdate.minusYears(3));

        System.out.println(localdate.toEpochDay());
        System.out.println(localdate.toEpochSecond(LocalTime.now(), ZoneOffset.UTC));

        LocalDateTime lDT = LocalDateTime.now();
        System.out.println(lDT);




    }
}
