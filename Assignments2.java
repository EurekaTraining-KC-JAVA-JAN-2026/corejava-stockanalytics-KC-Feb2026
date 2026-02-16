public class Assignments2 {
    public static void main(String[] args){
        //post increment
        System.out.println("post increment");
        int a=10;
        int b=a++;
        System.out.println(a);//11// 10+1
        System.out.println(b);//10//first  assign it and then increment
        //using loops
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
        // pree increment
        System.out.println("pre increment");
        int pre=20;
        int increment=++pre;
        System.out.println(pre);//21
        System.out.println(increment);//21//first increment
        for(int j=0;j<6;++j){
            System.out.println(j);
        }
        //post decrement
        System.out.println("post decrement");
        int dec=30;
        int value=dec--;
        System.out.println(dec);//29
        System.out.println(value);//30
        for(int d=3;d>0;d--){
            System.out.println(d);
        }
        //pre decrement
        System.out.println("pre decrement");
        int predec=40;
        int decrement=--predec;
        System.out.println(predec);//39
        System.out.println(decrement);//39
        for(int pr=3;pr>0;pr--){
            System.out.println(pr);
        }
    }
}

