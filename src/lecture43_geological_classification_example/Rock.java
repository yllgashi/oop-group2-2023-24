package lecture43_geological_classification_example;

class Rock {
    private static int CURRENTLY_USED_ID = 0;
    private int id;
    private double sizeInGram;

    public Rock(double sizeInGram) {
        incrementIdOrder();
        this.setId(CURRENTLY_USED_ID);
        this.setSizeInGram(sizeInGram);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSizeInGram() {
        return sizeInGram;
    }

    public void setSizeInGram(double sizeInGram) {
        this.sizeInGram = sizeInGram;
    }

    private static void incrementIdOrder() {
        CURRENTLY_USED_ID = CURRENTLY_USED_ID + 1;
    }

    public String getDescription() {
        return "ID: " + this.getId() + ", Size: " + this.getSizeInGram() + "g";
    }

    public final String getGeneralDescription() {
        return "ID: " + this.getId() + ", Size: " + this.getSizeInGram() + "g";
    }
}