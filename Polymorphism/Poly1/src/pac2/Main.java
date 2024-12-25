package pac2;

public class Main {
    public static void main(String[] args) {
        Tri tri = new Tri(3, 4, 5);
        tri.print();
        System.out.println("Triangle Perimetere   : " + tri.perimeter());

        Rect rect = new Rect(5, 10);
        rect.print();
        System.out.println("Rectangle Perimetere :    " + rect.perimeter());
    }
}