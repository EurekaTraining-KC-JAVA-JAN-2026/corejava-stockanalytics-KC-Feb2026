package com.inheritanceAssignment;

public class Main {
    public static void main(String[] args)
    {

        subChild subChild1 = new subChild("JOHN",34,"Boston","123",10,20,20,5);
        subChild1.work();

        subChild1.ageInfo();
        System.out.println(subChild1.totalPay(40));
        System.out.println(subChild1);

    }
}
