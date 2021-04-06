package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface Regex {
    Boolean validate(String string);
}
public class UserRegistrationLam {
    private static final String NAME_PATTERN = ("[A-Z][a-z]{2,}");
    private static final String EMAIL_PATTERN= ("^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$");
    private static final String MOBILE_NUMBER_PATTERN = ("^[0]?([+][0-9]{2,3}[-])?[6-9]+[0-9]{9}");
    private static final String PASSWORD_PATTERN = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$");
    static Scanner input = new Scanner(System.in);
    private static String setFirstName() {
        System.out.println("Enter the FirstName\nFirst Name Should Contains Minimum of 3 Characters\n " +
                "First Letter Should be in Capital");
        return input.nextLine();
    }
    private static String setLastName() {
        System.out.println("Enter the LastName\nLast Name Should Contains Minimum of 3 Characters\n " +
                "First Letter Should be in Capital");
        return input.nextLine();
    }
    private static String setEmail(){
        System.out.println("Enter The Email Address");
        return input.next();
    }
    private static String setMobileNumber(){
        System.out.println("Enter The Mobile Number");
        return input.next();
    }
    private static String setPassword(){
        System.out.println("Enter The PassWord of Minimum 8 Characters");
        return input.next();
    }
    public static String printResult(Boolean result){
        if (Boolean.TRUE.equals(result))
            return "Your Entry is Valid";
        else
            return "Your Enter is Invalid";
    }
    public static void main(String[] args) {
        Regex validateFirstName = firstName -> Pattern.matches(NAME_PATTERN,firstName);
        Regex validateLastName = lastName -> Pattern.matches(NAME_PATTERN,lastName);
        Regex validateEmail = email -> Pattern.matches(EMAIL_PATTERN, email);
        Regex validateMobileNumber = mobileNumber -> Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
        Regex validatePassword = password -> Pattern.matches(PASSWORD_PATTERN, password);
        System.out.println(printResult(validateFirstName.validate(setFirstName())));
        System.out.println(printResult(validateLastName.validate(setLastName())));
        System.out.println(printResult(validateEmail.validate(setEmail())));
        System.out.println(printResult(validateMobileNumber.validate(setMobileNumber())));
        System.out.println(printResult(validatePassword.validate(setPassword())));


    }

}
