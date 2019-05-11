package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Klient;

public interface KlientRepository extends JpaRepository <Klient, Long> {
}
