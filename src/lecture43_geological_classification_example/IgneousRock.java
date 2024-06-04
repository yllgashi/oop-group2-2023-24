package lecture43_geological_classification_example;

class IgneousRock extends Rock {
    private String volcanLocation;

    public IgneousRock(double sizeInGram, String volcanLocation) {
        super(sizeInGram);
        this.setVolcanLocation(volcanLocation);
    }

    public String getVolcanLocation() {
        return volcanLocation;
    }

    public void setVolcanLocation(String volcanLocation) {
        this.volcanLocation = volcanLocation;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Volcan location: " + this.getVolcanLocation();
    }

    // you cannot override methods marked as "final"
    //    @Override
    //    public String getGeneralDescription() {
    //        // ...
    //    }
}
