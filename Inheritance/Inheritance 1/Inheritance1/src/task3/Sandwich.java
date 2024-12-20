package task3;

public class Sandwich extends  Product{
    private double length;

    Sandwich(double length, String expires, double price){
        super(expires, price);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}
