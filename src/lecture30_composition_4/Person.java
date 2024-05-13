package lecture30_composition_4;

class Person {
    private String name;
    private Date birthdate;

    public Person(String name, Date birthdate) {
        this.setName(name);
        this.setBirthdate(birthdate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
