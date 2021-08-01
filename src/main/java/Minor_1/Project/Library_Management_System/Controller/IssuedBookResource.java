package Minor_1.Project.Library_Management_System.Controller;

import Minor_1.Project.Library_Management_System.DataAccessLayer.IssuedBook;
import Minor_1.Project.Library_Management_System.Repository.IssuedBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

@RestController
public class IssuedBookResource {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    IssuedBookRepo ib;
    @GetMapping("/details")
    public List<IssuedBook> getDetails(){
        return ib.findAll();
    }
    @PostMapping("/IssueBook")
    public IssuedBook newEntry(@RequestBody IssuedBook newIssue) throws Exception {
        try {
            return ib.save(newIssue);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new Exception();
        }
    }
    @GetMapping("/searchBookByUser/{id}")
    public Optional<IssuedBook> searchBookByUser(@PathVariable int id){
        return ib.findById(id);
    }
    @GetMapping("/BookReturned/{id}")
    public void BookReturned(@PathVariable int id) throws Exception{
        IssuedBook b=new IssuedBook();
        Date f=ib.getIssuedDate(id);
        Date s=b.getRet_date();
        int l=s.getDate()-f.getDate();
        if(l>7)
            ib.ReturnedBook("InActive", id, b.getRet_date(), l);
        else ib.ReturnedBook("InActive", id, b.getRet_date(), 0);
    }
}
