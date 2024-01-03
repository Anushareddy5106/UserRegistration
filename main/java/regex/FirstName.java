package regex;

import java.util.regex.Pattern;

public class FirstName {
    private String regex = "^[A-Z][a-zA-Z]{2,}$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String firstName) throws ValidationException {

        boolean isValid = pattern.matcher(firstName).matches();

        if (!isValid)
            throw new ValidationException(ValidationExceptionType.FirstNameException, "Firstname is invalid");

        return isValid;
    }

}