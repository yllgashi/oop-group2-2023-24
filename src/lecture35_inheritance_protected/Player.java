package lecture35_inheritance_protected;

class Player extends Person {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printInformation() {
        System.out.println(this.id);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(getPosition());
    }
}
