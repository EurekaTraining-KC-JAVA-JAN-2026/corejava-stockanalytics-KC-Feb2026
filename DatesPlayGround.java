import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("using date keyword"+date);
        //caling method from static class without new
        LocalDate localDate = LocalDate.now();
        System.out.println("using local date: "+localDate);
        System.out.println("local day of month:"+localDate.getDayOfMonth());
        System.out.println("local day of week:"+localDate.getDayOfWeek());
        System.out.println("local minus dqys:"+localDate.minusDays(3));
        System.out.println("going future in time by 3 months: "+localDate.plusMonths(3));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


//        System.out.println(localDate.toEpochDay());
//        System.out.println(localDate.toEpochSecond(LocalTime.now(), ZoneOffset.of(2)));
  // get stocksprice hiostoty for tesla for last 3 months

    }
}
