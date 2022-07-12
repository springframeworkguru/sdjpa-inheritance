package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Created by jt on 7/12/22.
 */
@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle{

    private String trimLevel;

    public String getTrimLevel() {
        return trimLevel;
    }

    public void setTrimLevel(String trimLevel) {
        this.trimLevel = trimLevel;
    }
}
