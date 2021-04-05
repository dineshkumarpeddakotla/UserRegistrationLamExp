package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner input = new Scanner(System.in);
    private static final String NAME_PATTERN ="[A-Z][a-z]{2,}";

    private String setFirstName() {
        System.out.println("Enter the FirstName\nFirst Name Should Contains Minimum of 3 Characters " +
                "\n First Letter Should be in Capital");
        return input.nextLine();
    }
    public void validateFirstName(){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Boolean result = pattern.matcher(setFirstName()).matches();
        System.out.println(nameResult(result));
    }
    public String nameResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Your Entry is Valid";
        }else
            return "Your Enter is Invalid";

    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.validateFirstName();
    }
}
