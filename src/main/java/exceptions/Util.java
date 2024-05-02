package exceptions;

import java.util.ResourceBundle;

public class Util {
    public static User login(String inputUserName, String inputPassword) throws LoginException {

        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("user");

            String username = resourceBundle.getString("username");
            String password = resourceBundle.getString("password");

            if (inputPassword.equals(password) && inputUserName.equals(username)) {
                String fullName = resourceBundle.getString("fullname");
                return new User(username, password, fullName);
            }

            return null;

        } catch (Exception e) {
            throw new LoginException(e);
        }
    }
}
