package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
    Scanner scanner = new Scanner(System.in);

    public FirstName() {

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        boolean isValid = validateFirstName(firstName);

        if (isValid) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Please enter a valid first name.");
        }
    }

    private boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(firstName).matches();
    }
}
