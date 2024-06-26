package classes;

public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Sobrecargar el constructor, constructor sin parametros
    public Date() {}

    //Sobrecargar el constructor, constructor con Fecha en formato String "dd/mm/yyyy"
    public Date(String date) {
        String[] partsOfDate = date.split("/");

        this.day = Integer.parseInt(partsOfDate[0]);
        this.month = Integer.parseInt(partsOfDate[1]);
        this.year = Integer.parseInt(partsOfDate[2]);
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

    // Sobrescribir el método toString heredado de Object
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Date otherDate = (Date) obj;

        return this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year;
    }
}
