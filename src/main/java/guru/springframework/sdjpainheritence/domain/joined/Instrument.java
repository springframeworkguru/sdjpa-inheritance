package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.*;

/**
 * Created by jt on 7/12/22.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
