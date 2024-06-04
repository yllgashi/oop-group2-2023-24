package lecture50_exceptions_1;

class HandleExceptionBasic {
    public static void main(String[] args) {
        int numberOne = 10;
//        int numberTwo = 2;
        int numberTwo = 0;
        int result = 0;


        try {
            result = numberOne / numberTwo;
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("An error happened...");
        }

        System.out.println("Application did not crash...");


        // try => try one piece of code which you as a programmer think it can happen an error
        // catch => a place where you can handle that specific error
        // finally => a block of code which will get executed in both cases (it did happen an error or not)
    }
}
