import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DatesPlayGround {
   public static void main(String[] args) {
       Date date=new Date();
       System.out.println(" DATE using new keyword" + date );
       LocalDate localdate = LocalDate.now();//calling now mthod from class level
       System.out.println("DATE using localDate" + localdate);
       System.out.println(localdate.getDayOfMonth());
       System.out.println(localdate.getDayOfWeek());
       System.out.println(localdate.getDayOfYear());
       System.out.println(localdate.minusDays(3));
       System.out.println("Going past in time in 3 days" + localdate.minusDays(3));
       System.out.println("Going in future in time in 3 days" +localdate.plusMonths(3));
       LocalTime localTime=LocalTime.now();
       System.out.println(localTime);

       LocalDateTime localDateTime=LocalDateTime.now();
       System.out.println(localTime);

       //System.out.println(localdate.toEpochDay());
       //System.out.println(localdate.toEpochSecond(LocalTime.now(), ZoneOffset.ofHours(2)));



    }
}

