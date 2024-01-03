package regex;

import java.util.regex.Pattern;

public class Password {
    private String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[@#$%^&+=!])(?!.*[@#$%^&+=!].*[@#$%^&+=!]).{8,}$";
    private Pattern pattern = Pattern.compile(regex);

    public boolean validate(String password) throws ValidationException {
        boolean isValid = pattern.matcher(password).matches();

        if (!isValid)
            throw new ValidationException(ValidationExceptionType.PasswordException, "Password is invalid");

        return isValid;
    }

}
