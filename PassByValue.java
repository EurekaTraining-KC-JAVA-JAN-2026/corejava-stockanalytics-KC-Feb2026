//import static jdk.jfr.internal.consumer.EventLog.update;

public class PassByValue {
public static void main(String[] args){
    int x=20;
    update(x);
    System.out.println(System.identityHashCode(x));
    System.out.println(x);

}
static void update(int a) {
    System.out.println(a);
    System.out.println(System.identityHashCode(a));
a=40;
System.out.println(a);
    System.out.println(System.identityHashCode(a));

    }

}
