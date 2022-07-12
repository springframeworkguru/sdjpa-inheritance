package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Created by jt on 7/12/22.
 */
@Entity
@DiscriminatorValue("truck")
public class Truck extends Vehicle{

    private Integer payload;

    public Integer getPayload() {
        return payload;
    }

    public void setPayload(Integer payload) {
        this.payload = payload;
    }
}
