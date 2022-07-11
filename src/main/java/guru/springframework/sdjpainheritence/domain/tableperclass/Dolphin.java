package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;

/**
 * Created by jt on 7/11/22.
 */
@Entity
public class Dolphin extends Mammal {

    private Boolean hasSpots;

    public Boolean getHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(Boolean hasSpots) {
        this.hasSpots = hasSpots;
    }
}
