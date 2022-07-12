package guru.springframework.sdjpainheritence.domain.repositories;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 7/12/22.
 */
public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}
