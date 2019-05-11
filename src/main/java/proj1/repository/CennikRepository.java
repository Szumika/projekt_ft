package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Cennik;

public interface CennikRepository extends JpaRepository<Cennik, Long> {
}
