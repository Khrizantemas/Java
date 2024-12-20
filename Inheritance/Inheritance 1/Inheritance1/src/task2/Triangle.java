package task2;

public class Triangle extends Figure{
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Triangle : " + (side1 + side2 + side3));
    }

    @Override
    public void area() {
        double s = (side1 + side2 + side3) /2 ;
        System.out.println("Area of triangle : " + Math.sqrt(s*(s - side1)*(s - side2)*(s -side3)));
    }
}
