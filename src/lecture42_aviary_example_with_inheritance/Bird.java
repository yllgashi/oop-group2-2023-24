package lecture42_aviary_example_with_inheritance;

class Bird {
    private int id;
    private String color;

    public Bird(int id, String color) {
        this.setId(id);
        this.setColor(color);
    }

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

    public void talk() {
        System.out.println("Ciu ciu");
    }
}
