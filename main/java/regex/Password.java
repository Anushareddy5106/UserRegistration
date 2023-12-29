package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public Password() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Valid password: " + password);
        } else {
            System.out.println("Please enter a valid password.");
        }
    }

    public Password(String password) {
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Valid password: " + password);
        } else {
            System.out.println("Please enter a valid password.");
        }
    }

    public boolean validatePassword(String password) {
        String regex = "(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(password).matches();
    }
}
