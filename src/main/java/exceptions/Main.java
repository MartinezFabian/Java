package exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            User user = Util.login("test", "123456");

            if (user != null) {
                System.out.println("Welcome " + user);
            } else {
                System.out.println("User or password incorrect");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
