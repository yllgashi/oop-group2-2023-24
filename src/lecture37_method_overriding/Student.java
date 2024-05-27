package lecture37_method_overriding;

class Student extends Person {

    // attributes
    private double averageGrade;


    // getters and setters
    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }


    // method overriding

    @Override
    public void printInformation() {
        System.out.println("ID: " + this.getId());
        System.out.println("FirstName: " + this.getFirstName());
        System.out.println("LastName: " + this.getLastName());
        System.out.println("Average grade: " + this.getAverageGrade());
    }


    // NOT NEEDED
    //    public void printStudentInformation() {
//        System.out.println("ID: " + this.getId());
//        System.out.println("FirstName: " + this.getFirstName());
//        System.out.println("LastName: " + this.getLastName());
//        System.out.println("Average grade: " + this.getAverageGrade());
//    }
}
