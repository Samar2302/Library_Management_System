package Minor_1.Project.Library_Management_System.Controller;

import Minor_1.Project.Library_Management_System.DataAccessLayer.Book;
import Minor_1.Project.Library_Management_System.DataAccessLayer.User;
import Minor_1.Project.Library_Management_System.Exception.InvalidUserException;
import Minor_1.Project.Library_Management_System.Exception.UserNotFoundException;
import Minor_1.Project.Library_Management_System.Repository.UserRepo;
import Minor_1.Project.Library_Management_System.Utill.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class UserResource {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    UserRepo u;
    @GetMapping("/users")
    public List<User> findAllUser(){
        return u.findAll();
    }
    @PostMapping("/newUser")
    public User NewUser(@RequestBody User newUser) throws Exception{
        if(UserValidator.isValidUser(newUser))
        return u.save(newUser);
        else throw new InvalidUserException(newUser.getName(), newUser.getContact(), newUser.getEmail());
    }
    @GetMapping("/User/{id}")
    User findOneUser(@PathVariable int id){
        logger.info("/user called with id "+id);
        return u.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        u.deleteById(id);
    }
//    @GetMapping("/searchbookbycategory/{name}")
//    public List<Book> searchbookbycategory(@PathVariable String name) {
//        return br.findByCategory(name);
//    }
}
