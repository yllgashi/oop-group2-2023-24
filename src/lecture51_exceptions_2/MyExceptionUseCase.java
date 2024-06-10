package lecture51_exceptions_2;

public class MyExceptionUseCase {
    public static void main(String[] args) {
        try {
            methodOne();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            // ...
        } catch (Exception e) {
            // ...
        }
    }

    public static void methodOne() throws MyException {
        throw new MyException("Message of exception");
    }
}