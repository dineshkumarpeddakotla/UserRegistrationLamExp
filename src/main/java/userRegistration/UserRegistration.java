package userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //Patterns of Name,Email,Mobile Number,Password
    private static final String NAME_PATTERN = ("[A-Z][a-z]{2,}");
    private static final String EMAIL_PATTERN= ("^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$");
    private static final String MOBILE_NUMBER_PATTERN = ("^[0]?([+][0-9]{2,3}[-])?[6-9]+[0-9]{9}");
    private static final String PASSWORD_PATTERN = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$");
    //checking to Validate First Name
    public boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean result = pattern.matcher(firstName).matches();
        System.out.println(printResult(result));
        return result;
    }
    //checking to Validate Last Name
    public Boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Boolean result = pattern.matcher(lastName).matches();
        System.out.println(printResult(result));
        return result;
    }

     // Creating Boolean value and checking later will check for more accurate email

    public Boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean result = pattern.matcher(email).matches();
        System.out.println(printResult(result));
        return result;
    }
    /*
      Checking For Mobile number
      The Accepted Types Are +00 000000000 ; +00 0000000000 ;+000 0000000000; 0 0000000000 ; 00 0000000000
         */
    public Boolean validateMobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        boolean result = pattern.matcher(mobileNumber).matches();
        System.out.println(printResult(result));
        return result;
    }
    //Only Checking For Word Type Password With Minimum Of 8 Digits, At Least One Capital Letter,At Least One Number,At Least One Special Character
    public Boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Boolean result = pattern.matcher(password).matches();
        System.out.println(printResult(result));
        return result;
    }
    public String printResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Your Entry is Valid";
        }else
            return "Your Enter is Invalid";
    }
}
