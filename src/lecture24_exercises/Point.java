package lecture24_exercises;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }
    }

    public int getY() {
        return this.y;
    }

    public double findDistanceBetweenPoints(Point p2) {
        int x1 = this.getX();
        int y1 = this.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return d;
    }
}
