package PracticeJava;

class Calculator{

    public Calculator() {
    }

    public  int area(int i) {
        return  i;
    }
    public  int area(int i, int j) {
        return  i+j;
    }
    public  double area(double k) {
        return  k;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.area(10));
        System.out.println(calculator.area(10,5));
        System.out.println(calculator.area(10.0));
    }
}
