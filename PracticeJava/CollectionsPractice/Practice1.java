package PracticeJava.CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        //arrList.remove(1);
        arrList.remove(Integer.valueOf(20));
        for(int i : arrList){
            System.out.println(i);
        }
    }
}
