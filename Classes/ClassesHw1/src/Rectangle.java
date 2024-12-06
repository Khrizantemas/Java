public class Rectangle {
    float width;
    float length;

    Rectangle(float width, float length){
        this.width=width;
        this.length = length;
    }

    void perimeter(){
        System.out.println("Perimeter of rectangle is : " + (width*2 + length*2));
    }

    void area(){
        System.out.println("Area of rectangle : " + width * length);
    }

    void iscube(){
            if (width == length) {
                System.out.println("Is square");
            }
            else {
                System.out.println("Is not square");
            }
}
    void diagonal(){
        System.out.println("Diagonal of rectangle : " + Math.sqrt(Math.pow(width,2) +Math.pow(length,2)));
    }

}
