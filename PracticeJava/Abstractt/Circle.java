package PracticeJava.Abstractt;

public class Circle extends Shape{
    public int radius ;
    public Circle(int i) {
        this.radius = i;

    }
    @Override
    public void calculateArea() {
        System.out.println("radius "+Math.PI*radius*radius);
    }
}
