package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;

/**
 * Created by jt on 7/12/22.
 */
@Entity
public class ElectricGuitar extends Guitar{

    private Integer numberOfPickups;

    public Integer getNumberOfPickups() {
        return numberOfPickups;
    }

    public void setNumberOfPickups(Integer numberOfPickups) {
        this.numberOfPickups = numberOfPickups;
    }
}
