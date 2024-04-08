package lecture19_enums_4;

public enum SearchEngine {
    // define instances (objects)
    GOOGLE("https://www.google.com"),
    BING("https://www.bing.com");


    // define enum constructor & attributes & methods

    private final String URL;

    private SearchEngine(String url) {
        this.URL = url;
    }

    public String getURL() {
        return URL;
    }
}
