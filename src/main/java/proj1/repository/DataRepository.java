package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.model.Data;

public interface DataRepository extends JpaRepository<Data, Long> {

}
