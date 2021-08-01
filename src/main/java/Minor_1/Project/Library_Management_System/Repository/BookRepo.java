package Minor_1.Project.Library_Management_System.Repository;

import Minor_1.Project.Library_Management_System.DataAccessLayer.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {

    @Query(value = "select * from Book b where b.author_name=:name",nativeQuery = true)
    List<Book> findByAuthor(String name);
    @Query(value = "select * from Book b where b.category=:name",nativeQuery = true)
    List<Book> findByCategory(String name);
}
