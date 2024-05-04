package collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Client> clients = new HashSet<>();

        clients.add(new Client("John Doe", "123456789", 1000.0));
        clients.add(new Client("Charlie Brown", "987654321", 2000.0));
        clients.add(new Client("Jane Doe", "123456789", 3000.0)); // El cliente ya existe

        for (Client client: clients) {
            System.out.println(client);
        }
    }
}
