package Interface;

import java.math.BigDecimal;

public class Shapes3DPlayGround {
    public static void main(String[] args){

        Cubiod cubiod1=new Cubiod(new BigDecimal(5),new BigDecimal(7),new BigDecimal(8));
        Cylinder cylinder1= new Cylinder(new BigDecimal(6),new BigDecimal(7));
        System.out.println("cubiod volume is :" +cubiod1.calVolume());
        System.out.println("cylinder surfaceArea:"+ cylinder1.calSurfaceArea() );
    }
}
