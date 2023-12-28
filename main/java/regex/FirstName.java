package regex;

import java.util.regex.Pattern;

public class FirstName {

    public FirstName(String firstName) {

        boolean isValid = validateFirstName(firstName);

        if (isValid) {
            System.out.println("Valid name: " + firstName);
        } else {
            System.out.println("Please enter a valid name.");
        }
    }

    public boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(firstName).matches();
    }
}
