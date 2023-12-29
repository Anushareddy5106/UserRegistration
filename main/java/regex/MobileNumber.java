package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumber {

    public MobileNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        boolean isValid = validateMobileNumber(mobileNumber);

        if (isValid) {
            System.out.println("Valid name: " + mobileNumber);
        } else {
            System.out.println("Please enter a Mobile Number.");
        }
    }

    public MobileNumber(String mobileNumber) {
        boolean isValid = validateMobileNumber(mobileNumber);

        if (isValid) {
            System.out.println("Valid name: " + mobileNumber);
        } else {
            System.out.println("Please enter a Mobile Number.");
        }
    }

    public boolean validateMobileNumber(String mobileNumber) {
        String regex = "^\\d{2} \\d{10}$";

        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(mobileNumber).matches();
    }
}
