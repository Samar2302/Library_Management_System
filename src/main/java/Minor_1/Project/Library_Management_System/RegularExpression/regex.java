package Minor_1.Project.Library_Management_System.RegularExpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
    public static void main(String[] args){
       /* System.out.println("Hello");
        String re=".";//single dot matches single character and double dot matches double character
        String text="a";
        Pattern pt=Pattern.compile(re);
        Matcher m=pt.matcher(text);
        boolean res=m.matches();
        System.out.println(res);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email");
        String email=sc.next();
        String reg="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@+" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pt=Pattern.compile(reg);
        Matcher m=pt.matcher(email);
        boolean res=m.matches();
        if(res)
        System.out.println("Valid");
        else System.out.println("Invalid");
        String c="9506234333";
        if(c.length()==10)
            System.out.println("valid");
    }
}
