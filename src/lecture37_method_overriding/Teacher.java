package lecture37_method_overriding;

class Teacher extends Person {

    // attributes
    private double salary;

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // method overriding

    @Override
    public void printInformation() {
        System.out.println("ID: " + this.getId());
        System.out.println("FirstName: " + this.getFirstName());
        System.out.println("LastName: " + this.getLastName());
        System.out.println("Average grade: " + this.getSalary());
    }

    // NOT NEEDED
//    public void printTeacherInformation() {
//        System.out.println("ID: " + this.getId());
//        System.out.println("FirstName: " + this.getFirstName());
//        System.out.println("LastName: " + this.getLastName());
//        System.out.println("Average grade: " + this.getSalary());
//    }
}
