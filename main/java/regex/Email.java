package regex;

import java.util.regex.Pattern;

public class Email {
    String regex = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String lastName) throws ValidationException {
        boolean isValid = pattern.matcher(lastName).matches();

        if (!isValid)
            throw new ValidationException(ValidationExceptionType.EmailException, "Email is invalid");

        return isValid;
    }

}