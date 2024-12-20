package task2;

public class Circle extends Figure{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle : " + (2*Math.PI * radius));
    }

    @Override
    public void area() {
        System.out.println("Area of circle : " + (Math.PI * Math.pow(radius,2)) );
    }

}
