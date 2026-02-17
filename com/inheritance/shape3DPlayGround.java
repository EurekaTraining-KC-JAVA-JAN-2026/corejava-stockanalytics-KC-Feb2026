package com.inheritance;

public class shape3DPlayGround {
    public static void main (String[] args){

        Cuboid cuboid1 = new Cuboid();
        System.out.println(cuboid1.volume());
        System.out.println(cuboid1.surfaceArea());


        Cube cube1 = new Cube( 2.5);
        System.out.println(cube1.volume());
        System.out.println(cube1.surfaceArea());


        cube1.play();
        System.out.println("multiple interface was done");




    }

}
