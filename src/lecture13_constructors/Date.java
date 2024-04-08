package lecture13_constructors;

public class Date {
    // attributes
    private int year;
    private int month;
    private int day;


    // constructor
    public Date(int year1, int month1, int day1) {
//        this.year = year1;
//        this.month = month1;
//        this.day = day1;
        setYear(year1);
        setMonth(month1);
        setDay(day1);
    }

    // properties (getters and setters)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}




