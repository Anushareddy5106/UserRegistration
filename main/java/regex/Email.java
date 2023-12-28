package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
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

        String regex = "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(emailAddress).matches();
    }

    public void emailTest() {
        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("Valid emails:");
        for (String email : emails) {
            if (validateEmail(email)) {
                System.out.println(email);
            } else {
                System.out.println("invalid");
            }
        }

        System.out.println("\nInvalid emails:");
        for (String email : invalidEmails) {
            if (!validateEmail(email)) {
                System.out.println(email);
            } else {
                System.out.println("valid");
            }
        }

    }
}
