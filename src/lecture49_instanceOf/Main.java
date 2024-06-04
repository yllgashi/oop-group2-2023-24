package lecture49_instanceOf;

class Main {
    public static void main(String[] args) {
        Person object = new Employee();

        if (object instanceof Person) {
            System.out.println("I am object (or have parent) of class Person");
        }
        if (object instanceof Employee) {
            System.out.println("I am object of class Employee");
        }
    }
}
