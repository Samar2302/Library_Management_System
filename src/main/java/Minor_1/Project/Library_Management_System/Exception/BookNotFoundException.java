package Minor_1.Project.Library_Management_System.Exception;
//Custom Exception
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id){
        super("Book Not Found "+id);
    }
}
