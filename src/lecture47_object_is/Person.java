package lecture47_object_is;

class Person {
    private String fullName;

    public Person(String fullName) {
        this.setFullName(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void introduce() {
        System.out.println("FullName: " + getFullName());
    }
}
