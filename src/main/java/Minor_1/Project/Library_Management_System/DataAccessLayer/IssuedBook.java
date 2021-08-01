package Minor_1.Project.Library_Management_System.DataAccessLayer;

import javax.persistence.*;
import java.util.Date;

@Entity
public class IssuedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Book_id")
    private int book_id;//unique
    @Column(name = "User_Id")
    private int user_id;//F.K.
    @Column(name = "Status")
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="issue_date")
    private Date issued_date;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="returned_date")
    private Date ret_date;
    @PrePersist
    private void onCreate(){
            issued_date=new Date();
    }
    @Column(name = "Late_Fee")
    private int late_fee;

    public int getLate_fee() {
        return late_fee;
    }
    public void setLate_fee(int late_fee) {
        this.late_fee = late_fee;
    }

    public Date getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(Date issued_date) {
        this.issued_date = issued_date;
    }

    public Date getRet_date() {
        ret_date=new Date();
        return ret_date;
    }

    public void setRet_date(Date ret_date) {
        this.ret_date = ret_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IssuedBook(int book_id, int user_id, String status) {
        this.book_id = book_id;
        this.user_id = user_id;
        this.status = status;
    }

    public IssuedBook() {
    }
}
