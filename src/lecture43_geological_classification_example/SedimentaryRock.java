package lecture43_geological_classification_example;

class SedimentaryRock extends Rock {
    private String mineralLocation;


    public SedimentaryRock(double sizeInGram, String mineralLocation) {
        super(sizeInGram);
        this.setMineralLocation(mineralLocation);
    }

    public String getMineralLocation() {
        return mineralLocation;
    }

    public void setMineralLocation(String mineralLocation) {
        this.mineralLocation = mineralLocation;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                ", Mineral location: " + this.getMineralLocation();
    }

    // you cannot override methods marked as "final"
    //    @Override
    //    public String getGeneralDescription() {
    //        // ...
    //    }
}