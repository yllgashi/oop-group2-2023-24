package lecture29_composition_with_arraylist_3;


import java.util.ArrayList;

class Classroom {
    private int id;
    private String color;
    private double size;

    private ArrayList<Chair> chairs;


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

    public ArrayList<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(ArrayList<Chair> chairs) {
        this.chairs = chairs;
    }

    public void addChairIntoClassroom(Chair chair) {
        if (this.chairs != null) {
            this.chairs.add(chair);
        }
    }
}