package lecture57_interfaces_3;

public class Square extends Shape implements ShapeCalculations {
    private int a;

    public Square(int id, int a) {
        this.setId(id);
        this.setA(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String showInformationOfShape() {
        return "This is a square";
    }

    @Override
    public double findPerimeter() {
        return 4 * a;
    }

    @Override
    public double findSyprine() {
        return a * a;
    }
}
