package composition;

public class Main {

    public static void main(String[] args) {
        // Ejemplo de composición entre objetos "Client" y "CreditCard"
        Client client = new Client("John Doe", "12345678", "Visa", "1234567890123456", "01/2025", "123", "John Doe");

        client.getCreditCard().addBalance(500.0);

        System.out.println(client.getFullName() + ", saldo: " + client.getCreditCard().getBalance());
    }
}
