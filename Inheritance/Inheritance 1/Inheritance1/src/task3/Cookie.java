package task3;

public class Cookie extends Product{
    private double mass;

    Cookie(double mass, String expires, double price){
        super(expires, price);
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


}
