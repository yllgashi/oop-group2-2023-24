package lecture56_interfaces_2;

class Goalkeeper extends Person implements Player {
    public Goalkeeper(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void play() {
        System.out.println("GK...");
    }

    @Override
    public void move() {
        System.out.println("GK...");
    }

    @Override
    public void score() {
        System.out.println("GK...");
    }
}
