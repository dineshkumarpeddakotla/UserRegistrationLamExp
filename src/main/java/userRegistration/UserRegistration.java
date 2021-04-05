package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner input = new Scanner(System.in);
    private static final String NAME_PATTERN = ("[A-Z][a-z]{2,}");
    private static final String EMAIL_PATTERN= ("^[A-Za-z]+(\\.[a-z A-z]+)?@[a-zA-z]{2,6}\\.[a-zA-Z]{2,6}([.][a-zA-z]{2,6})?$");
    private static final String MOBILE_NUMBER_PATTERN = ("^[0]?([+][0-9]{2,3}[-])?[6-9]+[0-9]{9}");
    private static final String PASSWORD_PATTERN = ("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$");
    private String setFirstName() {
        System.out.println("Enter the FirstName\nFirst Name Should Contains Minimum of 3 Characters\n " +
                           "First Letter Should be in Capital");
        return input.nextLine();
    }
    public void validateFirstName(){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Boolean result = pattern.matcher(setFirstName()).matches();
        System.out.println(printResult(result));
    }
    private String setLastName() {
        System.out.println("Enter the LastName\nLast Name Should Contains Minimum of 3 Characters\n " +
                           "First Letter Should be in Capital");
        return input.nextLine();
    }
    public void validateLastName(){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Boolean result = pattern.matcher(setLastName()).matches();
        System.out.println(printResult(result));
    }
    private String setEmail(){
        System.out.println("Enter The Email Address");
        return input.next();
    }
    public void validateEmail(){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Boolean result = pattern.matcher(setEmail()).matches();
        System.out.println(printResult(result));
    }
    private String setMobileNumber(){
        System.out.println("Enter The Mobile Number");
        return input.next();
    }
    public void validateMobileNumber(){
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Boolean result = pattern.matcher(setMobileNumber()).matches();
        System.out.println(printResult(result));
    }
    private String setPassword(){
        System.out.println("Enter The PassWord of Minimum 8 Characters");
        return input.next();
    }
    public void validatePassword(){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Boolean result = pattern.matcher(setPassword()).matches();
        System.out.println(printResult(result));
    }
    public String printResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Your Entry is Valid";
        }else
            return "Your Enter is Invalid";

    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validateFirstName();
        user.validateLastName();
        user.validateEmail();
        user.validateMobileNumber();
        user.validatePassword();
    }
}
