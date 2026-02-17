package inheritance;

import java.math.BigDecimal;

public class ShapesPlayGround {
    static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(new BigDecimal(10), new BigDecimal(20)) {
            @Override
            public BigDecimal calculateCircumference() {
                return null;
            }

        };
        Circle circle1 = new Circle(new BigDecimal(5));

    }
}
