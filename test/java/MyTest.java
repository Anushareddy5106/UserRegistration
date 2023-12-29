import org.junit.jupiter.api.*;

import regex.Email;
import regex.FirstName;
import regex.LastName;
import regex.MobileNumber;
import regex.Password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {

    @Test
    public void testHappyTestCase() {

        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String mobile = "91 9876543210";
        String password = "SecurePwd1!";

        assertTrue(new FirstName().validateFirstName(firstName), "First Name validation failed for Happy TC");
        assertTrue(new LastName().validateFirstName(lastName), "Last Name validation failed for Happy TC");
        assertTrue(new Email().validateEmail(email), "Email validation failed for Happy TC");
        assertTrue(new MobileNumber().validateMobileNumber(mobile), "Mobile validation failed for Happy TC");
        assertTrue(new Password().validatePassword(password), "Password validation failed for Happy TC");
    }

    @Test
    public void testSadTestCase() {
        String invalidFirstName = "Jo";
        String invalidLastName = "D0e";
        String invalidEmail = "invalid-email";
        String invalidMobile = "123456";
        String invalidPassword = "wea!!kpwd";

        assertFalse(new FirstName().validateFirstName(invalidFirstName),
                "First Name validation passed for Sad TC");
        assertFalse(new LastName().validateFirstName(invalidLastName), "Last Name validation passed for Sad TC");
        assertFalse(new Email().validateEmail(invalidEmail), "Email validation passed for Sad TC");
        assertFalse(new MobileNumber().validateMobileNumber(invalidMobile),
                "Mobile validation passed for Sad TC");
        assertFalse(new Password().validatePassword(invalidPassword), "Password validation passed for Sad TC");
    }

}
