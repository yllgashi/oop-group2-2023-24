package lecture35_inheritance_protected;

class Coach extends Person {
    private String experienceDescription;

    public String getExperienceDescription() {
        return experienceDescription;
    }

    public void setExperienceDescription(String experienceDescription) {
        this.experienceDescription = experienceDescription;
    }

    public void printInformation() {
        System.out.println(this.id); // now you can access Person attribtues (becasuse they are flagged as "protected")
        System.out.println(this.firstName); // now you can access Person attribtues (becasuse they are flagged as "protected")
        System.out.println(this.lastName); // now you can access Person attribtues (becasuse they are flagged as "protected")
        System.out.println(getExperienceDescription());
    }
}
