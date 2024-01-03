package regex;

public class ValidationException extends Exception {
    public ValidationExceptionType type;

    public ValidationException(ValidationExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}