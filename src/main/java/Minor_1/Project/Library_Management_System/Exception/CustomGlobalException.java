package Minor_1.Project.Library_Management_System.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
@RestController
public class CustomGlobalException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public void SpringHandlerNotFound(HttpServletResponse res) throws IOException {
        res.sendError(HttpStatus.NOT_FOUND.value());
    }
    @ExceptionHandler(BookNotFoundException.class)
    public void SpringHandlerNotFound2(HttpServletResponse res) throws IOException{
        res.sendError(HttpStatus.NOT_FOUND.value());
    }
    @ExceptionHandler(InvalidUserException.class)
    public  void SpringHandlerNotFound3(HttpServletResponse res) throws IOException{
        res.sendError(HttpStatus.NOT_FOUND.value());
    }
}
