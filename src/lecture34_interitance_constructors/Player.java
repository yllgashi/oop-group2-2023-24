package lecture34_interitance_constructors;

class Player extends Person {
    private String position;

    public Player(int id, String firstName, String lastName, String position) {
        super(id, firstName, lastName);
        this.setPosition(position);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
