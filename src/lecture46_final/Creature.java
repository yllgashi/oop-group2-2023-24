package lecture46_final;

class Creature {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("...");
    }


    // final method
    public final void breath() {
        System.out.println("...");
    }
}
