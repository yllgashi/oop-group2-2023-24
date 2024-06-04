package lecture50_exceptions_1;

class HandleExceptionOutsideMethod {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;

        try {
            calucateSum(numberOne, numberTwo);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic ex has happened...");
        } catch (Exception ex) {
            System.out.println("Other ex has happened...");
        }
    }

    public static void calucateSum(int numberOne, int numberTwo) {
        int sum = numberOne / numberTwo;
        System.out.println("Sum: " + sum);
    }
}
