public class Assignment_2 {

    public static void main(String[] args) {
        /*
        pre increment ,post increment ,pre decrement, post decrement
        pre - the value will change first(++a,--a) then another action will be performed
        post - it will use the value  (a++,a--) and changes value after performing
         */

        int a = 5;
        //pre increment
        System.out.println(" value of a before pre-increment" + " " + a);//5
        System.out.println("value of a while implementing pre-increment:" + " " + (++a));//6
        System.out.println("value of a after implementing pre-increment " + a);//6
        //post increment
        System.out.println(" value of a before pre-increment" + " " + a);//6
        System.out.println("value of a while implementing pre-increment:" + " " + (a++));//6
        System.out.println("value of a after implementing pre-increment " + a);//7

        // in the case of pre decrement it will get down the value first and then print

        System.out.println(" value of a before pre-decrement" + " " + a);//7
        System.out.println("value of a while implementing pre-decrement:" + " " + (--a));//6
        System.out.println("value of a after implementing pre-decrement " + a);//6

        // in case of post decrement it will print and decrese the value

        System.out.println(" value of a before pre-decrement" + " " + a);//6
        System.out.println("value of a while implementing pre-decrement:" + " " + (a--));//6
        System.out.println("value of a after implementing pre-decrement " + a);//5


    }
}
