package lecture34_interitance_constructors;

class Coach extends Person {

    public Coach(int id, String firstName, String lastName, String experienceDescription) {
        super(id, firstName, lastName);
//        this.setId(id);
//        this.setFirstName(firstName);
//        this.setLastName(lastName);

        this.setExperienceDescription(experienceDescription);
    }

    private String experienceDescription;

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }
}
