package classes;

public class DateTime extends DateDetailed{
    private int hour;
    private int minute;
    private int second;

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateTime(String date, int hour, int minute, int second) {
        super(date);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    @Override
    public String toString() {
        return super.toString() + " a las " + hour + ":" + minute + ":" + second;
    }
}
