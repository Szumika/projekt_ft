package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Przystanek;

public interface PrzystanekRepository extends JpaRepository<Przystanek, Long> {
}
