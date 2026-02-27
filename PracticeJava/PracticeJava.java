package PracticeJava;

public class PracticeJava {
    public static void main(String[] args) {
        int a = 10;
//        if(a%2==0){
//            System.out.println(a+" is even");
//        }else{
//            System.out.println(a+" is odd");
//        }
        System.out.println(a+" is "+((a%2==0) ? "even" : "Odd"));

        for(int i=1 ; i<=50;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" is fizzBuzz");
            }else if(i%3==0){
                System.out.println(i+" is fizz");
            }else if(i%5==0){
                System.out.println(i+" is buzz");
            }else{
                System.out.println("Not a FizzBuzz number");
            }
        }

        int in = 1234;
        int rev =0;
        while(in!=0){
            int digit = in%10;
            rev = rev*10+digit;
            in = in/10;
        }
        System.out.println(rev);

        int[] arr = {1,2,3,4,5};

        for(int i : arr){
            System.out.println(i+5);
        }
    }
}
