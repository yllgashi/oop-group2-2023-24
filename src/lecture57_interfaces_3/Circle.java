package lecture57_interfaces_3;

public class Circle extends Shape implements ShapeCalculations {
    private int r;

    public Circle(int id, int r) {
        this.setId(id);
        this.setR(r);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String showInformationOfShape() {
        return "This is a circle";
    }

    @Override
    public double findPerimeter() {
        return 2 * ShapeCalculations.PI * this.getR();
    }

    @Override
    public double findSyprine() {
        return Math.pow(this.getR(), 2) * ShapeCalculations.PI;
    }
}
