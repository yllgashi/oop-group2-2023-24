package lecture43_geological_classification_example;

class Granite extends IgneousRock {

    public Granite() {
        super(100, "Pompeu");
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Name: Granite";
    }
}
