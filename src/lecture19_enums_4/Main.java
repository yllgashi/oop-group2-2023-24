package lecture19_enums_4;

public class Main {
    public static void main(String[] args) {
        // enum in other words is a special class with pre-defined instances

        System.out.println(SearchEngine.GOOGLE); // instance of enum
        System.out.println(SearchEngine.GOOGLE.getURL()); // method of enum's instance

        System.out.println(SearchEngine.BING); // instance of enum
        System.out.println(SearchEngine.BING.getURL()); // method of enum's instance


        // example 2
        System.out.println(Season.SUMMER); // print "SUMMER"
        System.out.println(Season.SUMMER.getValueInText()); // print "Summer/Vera"

        // example 3
        System.out.println(Book.CHTP); // print "CHTP"
        System.out.println(Book.CHTP.getTitle()); // print "C How To Program"
        System.out.println(Book.CHTP.getCopyrightYear()); // print "2015"

        // example 4
        for (Book book : Book.values()) {
            System.out.println(book.getTitle());
        }
    }
}
