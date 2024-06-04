package lecture42_aviary_example_with_inheritance;

class FlyingBird extends Bird {
    public FlyingBird(int id, String color) {
        super(id, color);
    }

    @Override
    public void talk() {
        System.out.println("Skuak skuak");
    }
}
