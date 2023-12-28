package regex;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // UC1
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        new FirstName(firstName);

        // UC2
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        new LastName(lastName);

        // UC3
        Email email = new Email();
        email.emailTest();

    }
}