package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Pracownicy;

public interface PracownicyRepository extends JpaRepository <Pracownicy, Long> {
}
