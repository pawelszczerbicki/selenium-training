package pl.testuj.selenium.objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void nextYear() {
        year++;
    }

    public void nextMonth() {
        if (month < 12) {
            month++;
            return;
        }
        month = 1;
        nextYear();
    }

    public void nextDay() {
        if (day < 30) {
            day++;
            return;
        }
        day = 1;
        nextMonth();
    }
}
