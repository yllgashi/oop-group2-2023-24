package lecture43_geological_classification_example;

class Chalk extends SedimentaryRock {
    public Chalk() {
        super(200, "Rugove");
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Name: Chalk";
    }
}
