package smecherasii.exception;

public class NotFoundException extends SmecherasiiException {

    public static final String USER_NOT_FOUND = "User not found";

    public NotFoundException(String userNotFound) {
        super(userNotFound);
    }
}
