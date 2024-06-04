package lecture48_polymorphism_example;

class Circle extends Shape {
    private final double PI;
    private double r;

    public Circle(double r) {
        this.PI = 3.14;
        this.r = r;
    }

    @Override
    public double findPerimeter() {
        return 2 * this.r * this.PI;
    }

    @Override
    public double findSyprine() {
        return Math.pow(this.r, 2) * this.PI;
    }
}
