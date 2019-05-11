package proj1.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.security.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    void delete(User user);
    User findByUsername(String name);
}