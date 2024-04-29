package lecture27_composition;

class Person {
    private int id;
    private String firstName;
    private String lastName;
    private Brain brain;

//    private String brainColor;
//    private double brainSize;
//    private double brainCells;
//    private double brainLifetime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public void showInformation() {
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(lastName);
        brain.showInformation();
    }
}
