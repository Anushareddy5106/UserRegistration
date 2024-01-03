import org.junit.jupiter.api.*;

import regex.Email;
import regex.FirstName;
import regex.LastName;
import regex.MobileNumber;
import regex.Password;
import regex.ValidationException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {

    @Test
    public void testHappyTestCase() throws ValidationException {

        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String mobile = "91 9876543210";
        String password = "SecurePwd1!";

        assertTrue(new FirstName().validate(firstName), "First Name validation failed for Happy TC");
        assertTrue(new LastName().validate(lastName), "Last Name validation failed for Happy TC");
        assertTrue(new Email().validate(email), "Email validation failed for Happy TC");
        assertTrue(new MobileNumber().validate(mobile), "Mobile validation failed for Happy TC");
        assertTrue(new Password().validate(password), "Password validation failed for Happy TC");
    }

    @Test
    public void testSadTestCase() throws ValidationException {
        String invalidFirstName = "Jo";
        String invalidLastName = "D0e";
        String invalidEmail = "invalid-email";
        String invalidMobile = "123456";
        String invalidPassword = "wea!!kpwd";

        assertFalse(new FirstName().validate(invalidFirstName),
                "First Name validation passed for Sad TC");
        assertFalse(new LastName().validate(invalidLastName), "Last Name validation passed for Sad TC");
        assertFalse(new Email().validate(invalidEmail), "Email validation passed for Sad TC");
        assertFalse(new MobileNumber().validate(invalidMobile),
                "Mobile validation passed for Sad TC");
        assertFalse(new Password().validate(invalidPassword), "Password validation passed for Sad TC");
    }

}
