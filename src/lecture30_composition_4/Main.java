package lecture30_composition_4;

class Main {
    public static void main(String[] args) {

        Date dateOfPerson1 = new Date(1, 1, 1990);
        Person person1 = new Person("Filan Fisteku", dateOfPerson1);

        System.out.println(person1.getBirthdate());

        Date dateOfPerson2 = new Date(2, 2, 1990);
        Person person2 = new Person("Yll Gashi", dateOfPerson2);

        // show information of person1
        System.out.println("Name: " + person1.getName());
        System.out.println("Birthdate day: " + person1.getBirthdate());
        System.out.println("Birthdate month: " + person1.getBirthdate().getMonth());
        System.out.println("Birthdate year: " + person1.getBirthdate().getYear());
    }
}
