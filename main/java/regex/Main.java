package regex;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ValidationException {

        // UC1
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        FirstName fName = new FirstName();
        fName.validate(firstName);

        // UC2
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        LastName lName = new LastName();
        lName.validate(lastName);

        // UC3
        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();
        Email obj = new Email();
        obj.validate(email);

        // UC4
        System.out.print("Enter your Mobile Number: ");
        String mobile = scanner.nextLine();
        MobileNumber mNumber = new MobileNumber();
        mNumber.validate(mobile);

        // UC5
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();
        Password ps = new Password();
        ps.validate(password);

        UserRegistration user1 = new UserRegistration();

    }
}