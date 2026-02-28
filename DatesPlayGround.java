import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DatesPlayGround {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date using new Keyword"+date);
        LocalDate localDate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        System.out.println("date using localDate"+localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        //Minus Past
        System.out.println(localDate.minusDays(3));
        System.out.println(localDate.minusMonths(3));
        System.out.println(localDate.minusWeeks(3));
        //future
        System.out.println(localDate.plusDays(3));
        System.out.println(localDate.plusMonths(3));
        System.out.println(localDate.plusWeeks(3));

        //Time
        System.out.println(localtime);
        System.out.println(localDate.toEpochDay());
//        System.out.println(localDate.toEpochSecond(localtime));
    }
}
