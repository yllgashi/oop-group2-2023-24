package lecture24_exercises;

class Square {
    private int a;

    public Square(int a) {
        setA(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void draw() {
        System.out.println("-----------");
        System.out.print("|         |");
        System.out.print("|         |");
        System.out.print("|         |");
        System.out.println("-----------");
    }

    public double calculatePerimeter() {
        return 4 * a;
    }

    public double calculateSyprine() {
        return a * a;
    }

    public boolean hasGreaterSyprineThan(Square anotherSquare) {
        double syprineOne = this.calculateSyprine();
        double syprineTwo = anotherSquare.calculateSyprine();

        return syprineOne > syprineTwo;
    }
}
