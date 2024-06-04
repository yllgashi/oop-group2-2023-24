package lecture42_aviary_example_with_inheritance;

class WalkingBird extends Bird {
    public WalkingBird(int id, String color) {
        super(id, color);
    }

    @Override
    public void talk() {
        System.out.println("brr brr");
    }
}
