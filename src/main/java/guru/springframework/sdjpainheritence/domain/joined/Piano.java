package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;

/**
 * Created by jt on 7/12/22.
 */
@Entity
public class Piano extends Instrument {

    private Integer numberOfKeys;

    public Integer getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(Integer numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}
