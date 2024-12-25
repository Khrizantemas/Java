package pac2;

abstract class Shape {
    protected double x;
    protected double y;
    protected String name;

    public Shape(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public abstract double perimeter();

    public void print() {
        System.out.println("Shape: " + name + ", x: " + x + ", y: " + y);
    }
}

class Tri extends Shape {
    private double z;

    public Tri(double x, double y, double z) {
        super(x, y, "Triangle");
        this.z = z;
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("z: " + z);
    }
}

class Rect extends Shape {
    public Rect(double w, double h) {
        super(w, h, "Rectangle");
    }

    @Override
    public double perimeter() {
        return 2 * (x + y);
    }
}


