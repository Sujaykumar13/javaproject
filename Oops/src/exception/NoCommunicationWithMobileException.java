package exception;

public class NoCommunicationWithMobileException extends RuntimeException {
    public NoCommunicationWithMobileException(String message) {
        super(message);
    }
}
