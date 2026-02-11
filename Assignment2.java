public class Assignment2 {
    public static void main(String[] args) {

        // POST INCREMENT
        // The value is assigned FIRST then incremented by 1.
        System.out.println("post increment");
        int a = 10;
        int b = a++;
        System.out.println(a); // Result 11 (Value increased after assignment)
        System.out.println(b); // Result 10 (Assigned the original value of a )

        // Loop demonstrates i increases after each iteration finishes
        //for(int i = 0; i < 5; i++) {
            //System.out.println(i);
       // }

        // PRE INCREMENT
        //  The value is incremented by 1 FIRST then assigned
        System.out.println("pre increment");
        int pre = 20;
        int increment = ++pre;
        System.out.println(pre);       // Result 21
        System.out.println(increment); // Result 21 (Both are 21 because pre was updated before assignment)

        //for(int j = 0; j < 6; ++j) {
          //  System.out.println(j);
        //}

        // POST DECREMENT
        //  The value is used FIRST  then decreased by 1.
        System.out.println("post decrement");
        int dec = 30;
        int value = dec--;
        System.out.println(dec);   // Result is 29
        System.out.println(value); // Result is  30 (Assigned before dec dropped to 29)

        //for(int d = 3; d > 0; d--) {
            //System.out.println(d);
        //}

        //  PRE DECREMENT
        //  The value is decreased by 1 FIRST then used.
        System.out.println("pre decrement");
        int predec = 40;
        int decrementValue = --predec;
        System.out.println(predec);        // Result 39
        System.out.println(decrementValue); // Result 39 (Both reflect the new value)

        //for(int pr = 3; pr > 0; pr--) {
            //System.out.println(pr);
        }
    }
















































