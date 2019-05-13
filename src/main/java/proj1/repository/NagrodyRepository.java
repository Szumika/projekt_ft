package proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proj1.model.Nagrody;

import java.util.List;

public interface NagrodyRepository extends JpaRepository<Nagrody, Long> {
//    @Query(value = "SELECT * FROM firma_transportowa1.Nagrody where nazwa= ?1 ", nativeQuery = true)
//    List<Nagrody> FindByName();
}
