package lecture13_constructors;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(2024, 1, 1);
        System.out.println(date1.getYear());

        // implement validation
        Date date2 = new Date(2024123123, 123123, 11123);
        System.out.println(date2.getYear());


        // Call overloaded constructors
        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("BMW", 2010);
    }
}
