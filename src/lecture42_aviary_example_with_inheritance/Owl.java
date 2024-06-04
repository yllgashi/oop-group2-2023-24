package lecture42_aviary_example_with_inheritance;

class Owl extends FlyingBird {
    public Owl(int id, String color) {
        super(id, color);
    }

    @Override
    public void talk() {
        System.out.println("hu hu");
    }
}
