package lecture28_composition_2;

class Classroom {
    private int id;
    private String color;
    private double size;

    private Chair chairOne;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Chair getChairOne() {
        return chairOne;
    }

    public void setChairOne(Chair chairOne) {
        this.chairOne = chairOne;
    }

    public void showCharInformation() {
        System.out.println(chairOne.getId());
        System.out.println(chairOne.getMaterial());
    }
}
