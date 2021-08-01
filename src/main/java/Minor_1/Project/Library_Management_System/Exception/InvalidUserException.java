package Minor_1.Project.Library_Management_System.Exception;

public class InvalidUserException extends RuntimeException{
    public InvalidUserException(String name,String Contact,String email){
        super("Invalid user details "+name+" "+Contact+" "+email);
    }
}
