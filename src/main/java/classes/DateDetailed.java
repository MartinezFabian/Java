package classes;

public class DateDetailed extends Date {
    private String[] moths = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public DateDetailed(int day, int month, int year) {
        super(day, month, year); // Llamada al constructor de la clase padre
    }

    public DateDetailed(String date) {
        super(date);
    }

    @Override
    public String toString() {
        return getDay() + " de " + moths[getMonth() - 1] + " del " + getYear();
    }
}
