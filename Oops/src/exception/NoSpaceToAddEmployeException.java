package exception;

public class NoSpaceToAddEmployeException extends RuntimeException{
    public NoSpaceToAddEmployeException(String message)
    {
        super(message);
    }
}
