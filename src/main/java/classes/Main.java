package classes;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(26, 4,2024 );
        Date date2 = new Date(26, 4,2024 );

        if (date.equals(date2)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas son diferentes");
        }
    }
}
