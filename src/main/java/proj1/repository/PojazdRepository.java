package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Pojazd;


public interface PojazdRepository extends JpaRepository<Pojazd, Long> {


}