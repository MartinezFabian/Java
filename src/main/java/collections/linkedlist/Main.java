package collections.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<User> users = new LinkedList<User>();
        users.add(new User("johndoe", "asdfsadf", "John Doe"));
        users.add(new User("janedoe", "gddfghdfgh", "Jane Doe"));
        users.add(new User("charliebrown", "afrarsrt", "Charlie Brown"));
        users.add(new User("lizbrown", "asdfsadf", "Liz Brown"));

        // Elimiminar el usuario con username 'charliebrown'
        for (User user: users) {
            if (user.getUserName().equals("charliebrown")) {
                users.remove(user);
                break;
            }
        }

        // Agregar un nuevo usuario en la primera posicion
        users.addFirst(new User("fabian", "123456", "Fabian Martinez"));

        // Agregar un nuevo usuario en la ultima posicion
        users.addLast(new User("patricio", "4323456", "Patricio"));

        // Agregar un nuevo usuario en la posicion 2
        users.add(2, new User("jose", "1443151", "Jose Perez"));

        // Imprimir todos los usuarios
        System.out.println("\nUsuarios foreach: ");
        for (User user: users) {
            System.out.println(user);
        }


        // Crear iterador
        System.out.println("\nUsuarios iterator: ");

        ListIterator<User> iterator = users.listIterator();

        // Eliminar el usuario 'Fabian Martinez' e imprimir usuarios
        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getUserName().equals("fabian")) {
                iterator.remove();
                System.out.println("Usuario eliminado: " + user);
            } else {
                System.out.println("Username: " + user.getUserName() + ", FullName: " + user.getFullName());
            }
        }

        // Recorrer lista inversamente
        System.out.println("\nUsuarios reverseIterator: ");

        ListIterator<User> reverseIterator = users.listIterator(users.size());

        // Recorrer la lista en dirección descendente
        while (reverseIterator.hasPrevious()) {
            User user = reverseIterator.previous();
            System.out.println("Username: " + user.getUserName() + ", FullName: " + user.getFullName());
        }
    }
}
