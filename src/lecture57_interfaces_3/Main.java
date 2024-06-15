package lecture57_interfaces_3;

public class Main {
    public static void main(String[] args) {
        // we cannot create object of abstract class
        // Shape generalShape = new Shape();

        // we cannot create object of interfaces
        // ShapeCalculations generalShape2 = new ShapeCalculations();

        Square square1 = new Square(1, 10);
        Shape square2 = new Square(2, 20);
        ShapeCalculations square3 = new Square(3, 30);

        Circle circle1 = new Circle(4, 5);
        Shape circle2 = new Circle(5, 7);
        ShapeCalculations circle3 = new Circle(6, 11);
    }
}
