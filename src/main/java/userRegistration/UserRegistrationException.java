package userRegistration;
//Exceptions class
public class UserRegistrationException  extends Throwable {
    public exceptionType type;
    public UserRegistrationException(exceptionType type,String message) {
        super(message);
        this.type=type;
    }
    public enum exceptionType{
        nullInput,
        emptyInput
    }
}