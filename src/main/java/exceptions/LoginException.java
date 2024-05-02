package exceptions;

public class LoginException extends Exception{
    public LoginException(Exception e) {
        super("Error in login ", e);
    }
}
