package lecture24_exercises;

class PointExercise {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(7, 8);

        double distance = p1.findDistanceBetweenPoints(p2);

        System.out.printf("Distance between (%d, %d) and (%d, %d) is %.2f",
                p1.getX(), p1.getY(), p2.getX(), p2.getY(), distance);
    }
}
