package regex;

import java.util.regex.Pattern;

public class Password {
    private static boolean validatePassword(String password) {

        String rule1 = "^.{8,}$"; // Minimum 8 characters
        String rule2 = ".*[A-Z].*"; // At least 1 uppercase letter
        String rule3 = ".*\\d.*"; // At least 1 numeric digit
        String rule4 = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"; // Exactly 1 special character

        // Combine the rules into a single regex pattern
        String combinedRegex = rule1 + rule2 + rule3 + rule4;

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(combinedRegex);

        // Match the input against the pattern
        return pattern.matcher(password).matches();
    }
}
