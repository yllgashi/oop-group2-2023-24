package lecture48_polymorphism_example;

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);

        // Different implementation (with override)
        System.out.println(circle.findPerimeter());
        System.out.println(circle.findSyprine());

        // Different implementation (with override)
        System.out.println(square.findPerimeter());
        System.out.println(square.findSyprine());
    }
}
