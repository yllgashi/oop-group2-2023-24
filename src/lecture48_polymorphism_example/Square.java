package lecture48_polymorphism_example;

class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double findPerimeter() {
        return 4 * a;
    }

    @Override
    public double findSyprine() {
        return Math.pow(a, 2);
    }
}
