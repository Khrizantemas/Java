package pac3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100, 10, 4, 20);
        System.out.println(" Car Pric  : " + car.price());

        Dolly dolly = new Dolly(30, 20, 10);
        System.out.println(" Dolly Price  : " + dolly.price());
    }
}