package exception;

public class OverweightException extends RuntimeException{
    public OverweightException()
    {

    }
    public OverweightException(String message)
    {
        super(message);
    }
}
