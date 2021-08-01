package Minor_1.Project.Library_Management_System.Controller;

import Minor_1.Project.Library_Management_System.DataAccessLayer.Book;
import Minor_1.Project.Library_Management_System.Exception.BookNotFoundException;
import Minor_1.Project.Library_Management_System.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class BookResource {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    BookRepo br;
    @GetMapping("/books")
    List<Book> findAllBook(){
      logger.info("Find All Books Called");
      List<Book> l=new ArrayList<>();
      try {
          l = br.findAll();
          if (l.size() == 0) {
              logger.severe("No Book Found");
              throw new BookNotFoundException(500);
          }
      }catch(BookNotFoundException e)
      {
          logger.severe(e.toString());
          throw new ResponseStatusException(
                  HttpStatus.NOT_FOUND,"Book Not Found",e);
      }
      return l;
    }
    @PostMapping("/newBook")
    public Book NewBook(@RequestBody  Book newBook){
       return br.save(newBook);
    }
    @GetMapping("/searchBooksByAuthor/{name}")
    public List<Book> searchBooksByAuthor(@PathVariable String name){
       return br.findByAuthor(name);
    }
    @GetMapping("/searchBooksByCategory/{name}")
    public List<Book> searchBooksByCategory(@PathVariable String name) {
        return br.findByCategory(name);
    }
}
