package lecture53_abstract_classes_1;

public class Main {
    public static void main(String[] args) {
        // we cannot create instance of abstract class
        // Shape shape = new Shape();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Square square = new Square();
        square.draw();


        // we can create pointer, but reference should be in children classes
        Shape sh1 = new Rectangle();
        Shape sh2 = new Square();
    }
}
