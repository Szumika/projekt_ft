package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Rezerwacje;

public interface RezerwacjeRepository extends JpaRepository <Rezerwacje, Long> {
}
