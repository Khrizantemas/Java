package task3;

public class Milk extends Product {
    private double volume;

    Milk(double volume, String expires, double price){
        super(expires,price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
