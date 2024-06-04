package lecture50_exceptions_1;

class HandleExceptionInsideMethod {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 0;
        calucateSum(numberOne, numberTwo);
    }

    public static void calucateSum(int numberOne, int numberTwo) {
        try {
            int sum = numberOne / numberTwo;
            System.out.println("Sum: " + sum);
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic ex has happened...");
        }
        catch (Exception ex) {
            System.out.println("Other ex has happened...");
        }
    }
}
