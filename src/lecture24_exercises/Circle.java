package lecture24_exercises;

class Circle {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle(int r) {
        this.setR(r);
    }


    public double gjejPerimetrin() {
        double perimetri = 2 * Math.PI * this.getR();
        return perimetri;
    }

    public double gjejSyprinen() {
        double syprina = Math.PI * Math.pow(this.getR(), 2);
        return syprina;
    }
}
