package FileOperations;

public class NoMoreSpaceException extends RuntimeException {

    public NoMoreSpaceException(String message) {
        super(message);
    }
}
