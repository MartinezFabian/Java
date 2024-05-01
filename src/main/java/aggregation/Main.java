package aggregation;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de agregación entre objetos "Client" y "CreditCard"
        Client client = new Client("John Doe", "12345678");
        CreditCard creditCard = new CreditCard("Visa", "123456789", "01/01/2022", "123", "John Doe", 1000.0);

        client.setCreditCard(creditCard);
        client.getCreditCard().addBalance(500.0);

        System.out.println(client.getFullName() + ", saldo: " + client.getCreditCard().getBalance());
    }
}
