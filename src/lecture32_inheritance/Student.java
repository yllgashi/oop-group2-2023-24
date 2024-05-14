package lecture32_inheritance;

class Student extends Person {
    //    private int id;
//    private String firstName;
//    private String lastName;
//    private String personalNumber;
    private String generation;
    private double averageGrade;
    private String major;

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
