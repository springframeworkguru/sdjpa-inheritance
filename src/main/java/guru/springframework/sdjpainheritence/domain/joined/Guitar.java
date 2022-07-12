package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;

/**
 * Created by jt on 7/12/22.
 */
@Entity
public class Guitar extends Instrument {

    private Integer numberOfStrings;

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
