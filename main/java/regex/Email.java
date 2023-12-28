package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {

    Email() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Please enter a valid email.");
        }
    }

    public boolean validateEmail(String emailAddress) {

        String regex = "^[a-zA-Z0-9]+([._%+-]+[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(emailAddress).matches();
    }
}
