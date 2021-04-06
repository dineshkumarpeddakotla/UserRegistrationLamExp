import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userRegistration.UserRegistration;
import userRegistration.UserRegistrationException;

public class UserRegistrationAssertionTest {
    //Happy Test for First Name
    @Test
    public void givenFirstName_WhenProper_returnTrue() throws UserRegistrationException {
        UserRegistration test_FirstName = new UserRegistration();
        boolean result = test_FirstName.validateFirstName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for First Name
    @Test
    public void givenFirstName_WhenProper_returnFalse() throws UserRegistrationException {
        UserRegistration test_FirstName = new UserRegistration();
        boolean result = test_FirstName.validateFirstName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for First Name
    @Test
    public void givenLastName_WhenProper_returnTrue() throws UserRegistrationException {
        UserRegistration test_LastName = new UserRegistration();
        boolean result = test_LastName.validateLastName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Last Name
    @Test
    public void givenLastName_WhenProper_returnFalse() throws UserRegistrationException {
        UserRegistration test_LastName = new UserRegistration();
        boolean result = test_LastName.validateLastName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Email
    @Test
    public void givenEmail_WhenProper_returnTrue() throws UserRegistrationException {
        UserRegistration test_Email = new UserRegistration();
        boolean result = test_Email.validateEmail("dineshkumar.icon@gmail.com");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Email
    @Test
    public void givenEmail_WhenProper_returnFalse() throws UserRegistrationException {
        UserRegistration test_Email = new UserRegistration();
        boolean result = test_Email.validateEmail("dineshkumar...icon@gmail.com");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_returnTrue() throws UserRegistrationException {
        UserRegistration test_MobileNumber = new UserRegistration();
        boolean result = test_MobileNumber.validateMobileNumber("+91-8919105923");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_returnFalse() throws UserRegistrationException {
        UserRegistration test_MobileNumber = new UserRegistration();
        boolean result = test_MobileNumber.validateMobileNumber("+91--8919105923");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Password
    @Test
    public void givenPassword_WhenProper_returnTrue() throws UserRegistrationException {
        UserRegistration test_Password = new UserRegistration();
        boolean result = test_Password.validatePassword("Dinnu@Dinnu9");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Password
    @Test
    public void givenPassword_WhenProper_returnFalse() throws UserRegistrationException {
        UserRegistration test_Password = new UserRegistration();
        boolean result = test_Password.validatePassword("DinnuDinnu");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenEmptyFirstName_WhenEmpty_throwsException() {
        UserRegistration test_FirstName = new UserRegistration();
        try {
            boolean result = test_FirstName.validateFirstName("");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    //Sad Test For First Name
    @Test
    public void givenNullFirstName_WhenNull_throwsException() {
        UserRegistration test_FirstName = new UserRegistration();
        try {
            boolean result = test_FirstName.validateFirstName(null);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }

    }
    @Test
    public void givenEmptyLastName_WhenEmpty_throwsException() {
        UserRegistration test_LastName = new UserRegistration();
        try {
            boolean result = test_LastName.validateLastName("");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }

    }
    //Sad Test For Last Name
    @Test
    public void givenNullLastName_WhenNull_throwsException() {
        UserRegistration test_LastName = new UserRegistration();
        try {
            boolean result = test_LastName.validateLastName(null);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }

    }
    @Test
    public void givenEmptyEmail_WhenEmpty_throwsException() {
        UserRegistration test_Email = new UserRegistration();
        try {

            boolean result = test_Email.validateEmail("");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullEmail_WhenNull_throwsException() {
        UserRegistration test_Email = new UserRegistration();
        try {
            boolean result = test_Email.validateEmail(null);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyMobileNumber_WhenEmpty_throwsException() {
        UserRegistration test_MobileNumber = new UserRegistration();
        try {
            boolean result = test_MobileNumber.validateMobileNumber("");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMobileNumber_WhenNull_throwsException() {
        UserRegistration test_MobileNumber = new UserRegistration();
        try {
            boolean result = test_MobileNumber.validateMobileNumber(null);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyPassword_WhenEmpty_throwsException() {
        UserRegistration test_Password = new UserRegistration();
        try {
            boolean result = test_Password.validatePassword("");
            Assertions.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullPassword_WhenNull_throwsException() {
        UserRegistration test_Password = new UserRegistration();
        try {
            boolean result = test_Password.validatePassword(null);
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
