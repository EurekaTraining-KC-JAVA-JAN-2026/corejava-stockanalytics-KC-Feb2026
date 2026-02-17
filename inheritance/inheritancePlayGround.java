package inheritance;
import java.math.BigDecimal;

public class inheritancePlayGround {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(new BigDecimal(10), new BigDecimal(20)) {
            @Override
            public BigDecimal calculateCircumference() {
                return null;
            }

        };
        Circle circle1 = new Circle(new BigDecimal(5));
        System.out.println("circle's cicumferace is " + circle1.calculateCircumference());


        Rectangle rectangle2 = new Rectangle(new BigDecimal(10), new BigDecimal(20));
        System.out.println("rectancle's area is "+ rectangle2.calculateArea());

    }
}
