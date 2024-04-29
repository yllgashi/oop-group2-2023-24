package lecture27_composition;

class Brain {
    private String color;
    private double size;
    private double cells;
    private double lifetime;

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

    public double getCells() {
        return cells;
    }

    public void setCells(double cells) {
        this.cells = cells;
    }

    public double getLifetime() {
        return lifetime;
    }

    public void setLifetime(double lifetime) {
        this.lifetime = lifetime;
    }

    public void showInformation() {
        System.out.println(color);
        System.out.println(lifetime);
        System.out.println(cells);
        System.out.println(size);
    }
}
