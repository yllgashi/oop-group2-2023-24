package lecture24_exercises;

public class SquareExercise {
    public static void main(String[] args) {
        Square squareOne = new Square(5);
        Square squareTwo = new Square(10);

        double perimeterSquareOne = squareOne.calculatePerimeter();
        double syprineSquareOne = squareOne.calculateSyprine();
        boolean isSquareOneGreaterThanSquareTwo = squareOne.hasGreaterSyprineThan(squareTwo);

        System.out.printf("Perimeter of square 1 is: %.2f %n", perimeterSquareOne);
        System.out.printf("Syprine of square 1 is: %.2f %n", syprineSquareOne);
        System.out.printf("Is syprine 1 greater than syprine 2: %b %n", isSquareOneGreaterThanSquareTwo);
    }
}
