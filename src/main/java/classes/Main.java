package classes;

public class Main {
    public static void main(String[] args) {

        // Se puede llamar al constructor con argumentos
        Date date = new Date(26, 4,2024 );

        // Se puede llamar al constructor con un String como argumento
        Date date2 = new Date("26/04/2024");

        // Tambien se puede llamar al constructor sin argumentos
        Date date3 = new Date();
        date3.setDay(26);
        date3.setMonth(4);
        date3.setYear(2024);

        if (date.equals(date2)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas son diferentes");
        }

        DateDetailed dateDetailed1 = new DateDetailed(27, 4, 2024);
        System.out.println(dateDetailed1);

        DateDetailed dateDetailed2 = new DateDetailed("27/04/2024");
        System.out.println(dateDetailed2);

        DateTime dateTime = new DateTime("27/04/2024", 21, 15, 11);
        System.out.println(dateTime);
    }
}
