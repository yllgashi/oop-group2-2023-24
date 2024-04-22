package lecture24_exercises;

public enum RamType {
    SRAM("Static RAM"),
    DRAM("Dynamic RAM"),
    SDRAM("Synchronous Dynamic RAM");


    private String description;

    private RamType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
