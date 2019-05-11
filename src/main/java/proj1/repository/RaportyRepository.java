package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Raporty;

public interface RaportyRepository extends JpaRepository<Raporty, Long> {
}
