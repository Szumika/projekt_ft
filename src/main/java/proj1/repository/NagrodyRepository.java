package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Nagrody;

public interface NagrodyRepository extends JpaRepository<Nagrody, Long> {
}
