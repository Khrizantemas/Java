package pac1;

abstract class Polygon {
    protected int sides;
    protected double length;

    public Polygon(int sides, double length) {
        this.sides = sides;
        this.length = length;
    }

    public abstract double perimeter();
}

class Square extends Polygon {
    public Square(double length) {
        super(4, length);
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}

class Triangle extends Polygon {
    public Triangle(double length) {
        super(3, length);
    }

    @Override
    public double perimeter() {
        return 3 * length;
    }
}

