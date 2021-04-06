package userRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //Patterns of Name,Email,Mobile Number,Password
    private static final String NAME_PATTERN = ("[A-Z][a-z]{2,}");
    private static final String EMAIL_PATTERN= ("^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$");
    private static final String MOBILE_NUMBER_PATTERN = ("^[0]?([+][0-9]{2,3}[-])?[6-9]+[0-9]{9}");
    private static final String PASSWORD_PATTERN = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$");
    //checking to Validate First Name
    public Boolean validateFirstName(String firstName) throws UserRegistrationException {
        try {
            if (firstName.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.exceptionType.emptyInput,"You Entered Empty First Name");
            else {
                Pattern pattern = Pattern.compile(NAME_PATTERN);
                return pattern.matcher(firstName).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.exceptionType.nullInput, "You Passed Null First Name");
        }

    }

    public Boolean validateLastName(String lastName) throws UserRegistrationException {
        try {
            if (lastName.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.exceptionType.emptyInput,"You Entered Empty Last Name");
            else {
                Pattern pattern = Pattern.compile(NAME_PATTERN);
                return pattern.matcher(lastName).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.exceptionType.nullInput, "You Passed Null Last Name");
        }

    }

     //Creating Boolean value and checking more accurate email

    public Boolean validateEmail(String email) throws UserRegistrationException {
        try {
            if (email.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.exceptionType.emptyInput,"You Entered Empty Email");
            else {
                Pattern pattern = Pattern.compile(EMAIL_PATTERN);
                return pattern.matcher(email).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.exceptionType.nullInput, "You Passed Null Email");
        }


    }
    /*
         Checking For Mobile number
          The Accepted Types Are +00 000000000 ; +00 0000000000 ;+000 0000000000; 0 0000000000 ; 00 0000000000
         */
    public Boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        try {
            if (mobileNumber.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.exceptionType.emptyInput,"You Entered Empty Mobile Number");
            else {
                Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
                return pattern.matcher(mobileNumber).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.exceptionType.nullInput, "You Passed Null Mobile Number");
        }


    }
    //Only Checking For Word Type Password With Minimum Of 8 Digits, At Least One Capital Letter,At Least One Number,At Least One Special Character
    public Boolean validatePassword(String password) throws UserRegistrationException {
        try {
            if (password.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.exceptionType.emptyInput,"You Entered Empty Password");
            else {
                Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
                return pattern.matcher(password).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserRegistrationException(UserRegistrationException.exceptionType.nullInput, "You Passed Null Password");
        }

    }

}
