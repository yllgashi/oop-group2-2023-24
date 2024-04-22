package lecture24_exercises;

class Rectangle {

    private int a;

    private int b;

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setAB(int a, int b) {
        if (a < b) {
            this.a = a;
            this.b = b;
        }
        System.out.println("Nuk plotesohen kriteret per drejtekendsh...");
    }


    public Rectangle(int a, int b) {
        this.setAB(a, b);
    }

    public Rectangle() {

    }


    public int gjejPerimetrin() {
        int result;
        result = (2 * this.getA()) + (2 * this.getB());
        return result;
    }

    public int gjejSyprinen() {
        int result;
        result = (this.getA() * this.getB());
        return result;
    }

    public void printoDrejtkendeshin() {
        System.out.println("-----------------");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("------------------");
    }
}
