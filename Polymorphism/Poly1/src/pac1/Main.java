package pac1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sides : ");
        int n = sc.nextInt();
        System.out.print("Length : ");
        double len = sc.nextDouble();

        Polygon poly = new Polygon(n, len) {
            @Override
            public double perimeter() {
                return sides * length;
            }
        };

        System.out.println("Polygon Perimetere : " + poly.perimeter());

        System.out.print("Square Lengh : ");
        double sqLen = sc.nextDouble();
        Square sq = new Square(sqLen);
        System.out.println("Square Perimetere : " + sq.perimeter());

        System.out.print("Triangle Length  : ");
        double triLen = sc.nextDouble();
        Triangle tri = new Triangle(triLen);
        System.out.println("Triangle Perimeter : " + tri.perimeter());
    }
}
