package regex;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    String firstName;
    String lastName;
    String email;
    String password;
    String mobileNumber;

    static Scanner sc = new Scanner(System.in);

    static Map<String, String> map = Map.of("FirstName", "^[A-Z][a-zA-Z]{2,}$", "LastName", "^[A-Z][a-zA-Z]{2,}$",
            "Email",
            "^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$", "MobileNumber",
            "^\\d{2} \\d{10}$", "Password", "(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}");

    UserRegistration() {
        this(validation("FirstName"), validation("LastName"), validation("Email"),
                validation("Password"), validation("MobileNumber"));
    }

    UserRegistration(String firstName, String lastName, String email, String password, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;

        System.out.println("User Registered Successfully");
    }

    public static String validation(String field) {

        String regex = map.get(field);
        Pattern pattern = Pattern.compile(regex);
        String value = null;

        boolean isValid = false;
        while (!isValid) {
            System.out.println("Enter " + field + ": ");
            value = sc.nextLine();

            isValid = pattern.matcher(value).matches();
            if (!isValid) {
                System.out.println(field + " is Invalid");
            }
        }

        return value;
    }

}
