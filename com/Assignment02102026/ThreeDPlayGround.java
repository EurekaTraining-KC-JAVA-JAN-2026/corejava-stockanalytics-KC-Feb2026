package com.Assignment02102026;

import com.Assignment02162026.Cylinder;
import com.Assignment02162026.Sphere;

import java.math.BigDecimal;

public class ThreeDPlayGround {
    public static void main(String[] args) {
        Cube cube1=new Cube(new BigDecimal(4));
        Cuboid cuboid1=new Cuboid(new BigDecimal(2),new BigDecimal(3),new BigDecimal(5));
        Sphere sphere1= new Sphere(new BigDecimal(3));
        Cylinder cylinder1 = new Cylinder(new BigDecimal(3),new BigDecimal(2));

        System.out.println("displayed using shape interface "+cube1.shape());
        System.out.println("Volume of Cube: "+cube1.volume());
        System.out.println("Surface Area of Cube: "+cube1.surfaceArea());
        System.out.println("displayed using shape interface "+cuboid1.shape());
        System.out.println("Volume of Cuboid: "+cuboid1.volume());
        System.out.println("Surface Area of Cuboid: "+cuboid1.surfaceArea());
        System.out.println("displayed using shape interface "+sphere1.shape());
        System.out.println("Volume of Sphere: "+sphere1.volume());
        System.out.println("Surface Area of Sphere: "+sphere1.surfaceArea());
        System.out.println("Volume of Cylinder: "+cylinder1.volume());
        System.out.println("Surface Area of Cylinder: "+cylinder1.surfaceArea());

        /**
         * ->In this assignment we are practising with different types of inheritance
         * ->Single Inheritance: One child class inherits from one parent class.
         *             -Here Cylinder inherits from ThreeDShapes
         * ->Multilevel Inheritance:  A "Grandparent -> Parent -> Child" relationship.
         *             -Here Cube is inherits from cuboid and cuboid inherits from ThreeDShapes
         *             -ThreeDShapes -> Cuboid -> Cube
         * ->Hierarchical Inheritance: Multiple classes inherit from the same parent.
         *             -Here cuboid, sphere and cylinder inherit form threedshapes.
         * ->Multiple Inheritance: A class inherits behavior from more than one source
         *             -Here cuboid and sphere inherits from shapes and threedshapes
         * ->Hybrid Inheritance: A combination of two or more types of inheritance.
         *             -Here threedplayground contains all the above inheritance types
         */

    }
}
