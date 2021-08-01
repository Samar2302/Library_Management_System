package Minor_1.Project.Library_Management_System.Repository;

import Minor_1.Project.Library_Management_System.DataAccessLayer.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
