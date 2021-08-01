package Minor_1.Project.Library_Management_System.Repository;

import Minor_1.Project.Library_Management_System.DataAccessLayer.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Date;

public interface IssuedBookRepo extends JpaRepository<IssuedBook,Integer> {
    @Transactional
    @Modifying
    @Query(value = "update issued_book ib set ib.status=:status,ib.returned_date=:ret,ib.Late_Fee=:l where ib.user_id=:id",nativeQuery = true)
    void ReturnedBook(String status, int id, Date ret,int l);
    @Query(value="Select issue_date from issued_book ib where ib.user_id=:id",nativeQuery = true)
    Date getIssuedDate(int id);

}
