package Minor_1.Project.Library_Management_System.RegularExpression;

import Minor_1.Project.Library_Management_System.DataAccessLayer.IssuedBook;
import Minor_1.Project.Library_Management_System.Repository.IssuedBookRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){
        Date i=new Date();
        Date r=new Date();
        System.out.println("i= "+i+" r= "+r);
        long l= (i.getTime()-r.getTime());
        System.out.println(l);
    }
}
