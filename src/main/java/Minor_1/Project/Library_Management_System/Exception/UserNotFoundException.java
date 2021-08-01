package Minor_1.Project.Library_Management_System.Exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(int id){
        super("User not Found with id "+id);
    }
}
