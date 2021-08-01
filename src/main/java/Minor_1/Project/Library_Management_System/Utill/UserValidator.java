package Minor_1.Project.Library_Management_System.Utill;

import Minor_1.Project.Library_Management_System.DataAccessLayer.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static boolean isValidUser(User user){
        if(user.getName().equals(null) || user.getName().equals("")){
            return false;
        }
        else if(user.getContact().length()!=10){
            return false;
        }
        else if(EmailValidator(user.getEmail())==false){
            return false;
        }
        else return true;
    }
    public static boolean EmailValidator(String email){
        String reg="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@+" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pt=Pattern.compile(reg);
        Matcher m=pt.matcher(email);
        boolean res=m.matches();
        if(res)
            return true;
        else return false;
    }
}
