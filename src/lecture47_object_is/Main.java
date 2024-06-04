package lecture47_object_is;

public class Main {
    public static void main(String[] args) {
        System.out.println("#############");
        Person obj1 = new Person("Filan Fisteku");
        obj1.introduce();

        System.out.println("#############");
        Employee obj2 = new Employee("Testim Testeri", 100);
        obj2.introduce();


        //
        System.out.println("#############");
        Person obj3 = new Employee("Alushi", 200);
        obj3.introduce();

        // now you cannot access salary attribute with obj3
        // obj3.getSalary();

        // in order to make this happen, you need to cast it into right class
        Employee obj4 = (Employee) obj3;
        System.out.println(obj4.getSalary());








        ///
    }
}
