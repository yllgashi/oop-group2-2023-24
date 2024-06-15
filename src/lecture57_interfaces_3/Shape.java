package lecture57_interfaces_3;

abstract class Shape {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String showInformationOfShape();
}
