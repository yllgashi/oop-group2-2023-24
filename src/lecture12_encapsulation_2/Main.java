package lecture12_encapsulation_2;

public class Main {
    public static void main(String[] args) {
        // no validation, too much access in object attributes
        Date1 date1 = new Date1();
        date1.year = 20241;
        date1.month = 15;
        date1.day = 32;

        // has validation, maintain object integrity, allow attribtues to be set only through interface (set methods)
        Date2 date2 = new Date2();
        date2.setYear(20241);
        date2.setMonth(15);
        date2.setDay(32);
    }
}
