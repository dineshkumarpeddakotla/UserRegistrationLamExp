import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userRegistration.UserRegistration;

public class UserRegistrationAssertionTest {
    //Happy Test for First Name
    @Test
    public void givenFirstName_WhenProper_returnTrue(){
        UserRegistration test_FirstName = new UserRegistration();
        boolean result = test_FirstName.validateFirstName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for First Name
    @Test
    public void givenFirstName_WhenProper_returnFalse(){
        UserRegistration test_FirstName = new UserRegistration();
        boolean result = test_FirstName.validateFirstName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for First Name
    @Test
    public void givenLastName_WhenProper_returnTrue(){
        UserRegistration test_LastName = new UserRegistration();
        boolean result = test_LastName.validateLastName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Last Name
    @Test
    public void givenLastName_WhenProper_returnFalse(){
        UserRegistration test_LastName = new UserRegistration();
        boolean result = test_LastName.validateLastName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Email
    @Test
    public void givenEmail_WhenProper_returnTrue(){
        UserRegistration test_Email = new UserRegistration();
        boolean result = test_Email.validateEmail("dineshkumar.icon@gmail.com");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Email
    @Test
    public void givenEmail_WhenProper_returnFalse(){
        UserRegistration test_Email = new UserRegistration();
        boolean result = test_Email.validateEmail("dineshkumar...icon@gmail.com");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_returnTrue(){
        UserRegistration test_MobileNumber = new UserRegistration();
        boolean result = test_MobileNumber.validateMobileNumber("+91-8919105923");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Mobile Number
    @Test
    public void givenMobileNumber_WhenProper_returnFalse(){
        UserRegistration test_MobileNumber = new UserRegistration();
        boolean result = test_MobileNumber.validateMobileNumber("+91--8919105923");
        Assertions.assertFalse(result,"SAD");
    }
    //Happy Test for Password
    @Test
    public void givenPassword_WhenProper_returnTrue(){
        UserRegistration test_Password = new UserRegistration();
        boolean result = test_Password.validatePassword("Dinnu@Dinnu9");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test for Password
    @Test
    public void givenPassword_WhenProper_returnFalse(){
        UserRegistration test_Password = new UserRegistration();
        boolean result = test_Password.validatePassword("DinnuDinnu");
        Assertions.assertFalse(result,"SAD");
    }
}
