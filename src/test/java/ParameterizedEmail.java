import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import userRegistration.UserRegistration;
import userRegistration.UserRegistrationException;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedEmail {
    String email;
    boolean emailResult;
    public ParameterizedEmail(String email, boolean emailResult){
        this.email = email;
        this.emailResult = emailResult;
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{null, false}, {"",true}});
    }
    @Test
    public void givenEmail_WhenObeysCondition_returnAsDesired() {
      UserRegistration test_email = new UserRegistration();
        try {
            //Expecting the exceptions
            test_email.validateEmail(this.email);
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
        } catch (UserRegistrationException e) {
            e.printStackTrace();

        }

    }
}
