package inheritance;

import java.math.BigDecimal;

public class ShapesPlayGround {
    static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(new BigDecimal(10), new BigDecimal(20)) {
            @Override
            public BigDecimal calculateCircumference() {
                return null;
            }

            @Override
            public BigDecimal CubiodTotalSurafaceArea() {
                return null;
            }

            @Override
            public BigDecimal CuboidVolume() {
                return null;
            }
        };
        Circle circle1 = new Circle(new BigDecimal(5));
        Cuboid cuboid1 = new Cuboid(new BigDecimal(10), new BigDecimal(15), new BigDecimal(20)) {
            @Override
            public BigDecimal calculateArea() {
                return null;
            }

            @Override
            public BigDecimal calculatePerimeter() {
                return null;
            }

            @Override
            public BigDecimal calculateCircumference() {
                return null;
            }
        };
        Cube cube1= new Cube(new BigDecimal(4)) {
            @Override
            public BigDecimal calculateArea() {
                return null;
            }

            @Override
            public BigDecimal calculatePerimeter() {
                return null;
            }

            @Override
            public BigDecimal calculateCircumference() {
                return null;
            }

            @Override
            public BigDecimal CubiodTotalSurafaceArea() {
                return null;
            }
        };
    }
}
