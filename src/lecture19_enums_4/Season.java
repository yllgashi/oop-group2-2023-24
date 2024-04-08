package lecture19_enums_4;

public enum Season {
    // define instances (objects)
    SPRING("Spring/Pranvera"),
    SUMMER("Summer/Vera"),
    FALL("Fall/Vjeshta"),
    WINTER("Winter/Dimri");


    // define enum constructor & attributes & methods

    private final String value;

    private Season(String url) {
        this.value = url;
    }

    public String getValueInText() {
        return value;
    }
}
