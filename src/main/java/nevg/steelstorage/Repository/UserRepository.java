package nevg.steelstorage.Repository;

import nevg.steelstorage.Models.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
