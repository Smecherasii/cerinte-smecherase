package smecherasii.exception;

public class InvalidDataException extends SmecherasiiException {

    public static final String INVALID_STUDENT_DATA = "Invalid student data";

    public static final String INVALID_COMPANY_DATA = "Invalid company data";

    public InvalidDataException(String message) {
        super(message);
    }
}
