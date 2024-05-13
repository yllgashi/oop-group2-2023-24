package lecture30_composition_4;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
