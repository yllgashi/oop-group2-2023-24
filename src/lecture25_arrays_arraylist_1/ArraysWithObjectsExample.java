package lecture25_arrays_arraylist_1;

import java.util.Scanner;


/*
    Arrays => Use arrays when you know exactly number of elements in collection
 */
public class ArraysWithObjectsExample {
    public static void main(String[] args) {
        // array
        int[] array1 = new int[10];
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        fillArray(array1);
        // array1[12] = 10; ERROR


        // create array of objects
        Person[] people = new Person[10];

        Person person1 = new Person("Filan", "Fisteku");
        Person person2 = new Person("Testim", "Testeri");

        people[0] = person1;
        people[1] = person2;

        System.out.println(person1.getFirstName());
        System.out.println(people[0].getFirstName());
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void fillPeopleArray(Person[] people) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {

            System.out.println("Person " + i + " first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Person " + i + " last name: ");
            String lastName = scanner.nextLine();

            Person person = new Person(firstName, lastName);

            people[i] = person;

        }
    }

    public static void showPeopleArray(Person[] people) {
        for (int i = 0; i < people.length; i++) {

            String personFirstName = people[i].getFirstName();
            String personLastName = people[i].getLastName();

            System.out.println(personFirstName + " " + personLastName);
        }
    }
}
