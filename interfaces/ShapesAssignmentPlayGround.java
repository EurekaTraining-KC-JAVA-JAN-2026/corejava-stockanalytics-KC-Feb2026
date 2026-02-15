package interfaces;

import java.math.BigDecimal;

public class ShapesAssignmentPlayGround {
    public static void main(String[] args){
        Cyclinder cly=new Cyclinder(new BigDecimal(2),new BigDecimal(4));
        System.out.println(cly.calsurface());
        System.out.println(cly.calvol());
        Sphere sp=new Sphere(new BigDecimal(4),new BigDecimal(6));
        System.out.println(sp.calsurface());
        System.out.println(sp.calvol());
    }
}
