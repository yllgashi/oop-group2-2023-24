package lecture19_enums_4;

public enum Book {
    // define instances (objects)
    JHTP("Java How To Program", 2015),
    CHTP("C How To Program", 2015);


    // define enum constructor & attributes & methods

    private String bookName;
    private final int copyrightYear;

    private Book(String bookName, int copyrightYear) {
        this.bookName = bookName;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return bookName;
    }

    public int getCopyrightYear() {
        return copyrightYear;
    }
}
