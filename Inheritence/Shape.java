package Inheritence;

import java.math.BigDecimal;

public interface Shape {
    BigDecimal calArea();
    BigDecimal calPerimeter();
    BigDecimal calCircumference();

    default void geometry(){
        System.out.println("Printing Geometry");
    }

}
