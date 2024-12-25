package pac3;

abstract class Toy {
    public abstract double price();
}

class Car extends Toy {
    private double body;
    private double wheel;
    private int wheels;
    private double extra;

    public Car(double body, double wheel, int wheels, double extra) {
        this.body = body;
        this.wheel = wheel;
        this.wheels = wheels;
        this.extra = extra;
    }

    @Override
    public double price() {
        return body + (wheel * wheels) + extra;
    }
}

class Dolly extends Toy {
    private double hair;
    private double clothes;
    private double extra;

    public Dolly(double hair, double clothes, double extra) {
        this.hair = hair;
        this.clothes = clothes;
        this.extra = extra;
    }

    @Override
    public double price() {
        return hair + clothes + extra;
    }
}

