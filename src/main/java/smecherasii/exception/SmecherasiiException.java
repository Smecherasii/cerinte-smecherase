package smecherasii.exception;

abstract class SmecherasiiException extends RuntimeException {

    public SmecherasiiException() {
    }

    public SmecherasiiException(String message) {
        super(message);
    }

}
