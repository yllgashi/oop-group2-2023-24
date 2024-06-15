package lecture56_interfaces_2;

class Attacker extends Person implements Player {

    public Attacker(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    @Override
    public void play() {
        System.out.println("AT...");
    }

    @Override
    public void move() {
        System.out.println("AT...");
    }

    @Override
    public void score() {
        System.out.println("AT...");
    }
}
