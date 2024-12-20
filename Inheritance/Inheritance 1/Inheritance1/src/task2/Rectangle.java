package task2;

public class Rectangle extends Figure {

    private double width;
    private  double length;

    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle : " + width * length);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of perimeter : " + ((width*2) + (length*2)));
    }

    public void diagonal(){
        System.out.println("Diagonal of rectangle : " + Math.sqrt((Math.pow(width,2) + Math.pow(length,2))));
    }
}
