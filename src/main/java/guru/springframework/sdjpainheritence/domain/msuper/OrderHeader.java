package guru.springframework.sdjpainheritence.domain.msuper;

import jakarta.persistence.Entity;

/**
 * Created by jt on 7/8/22.
 */
@Entity
public class OrderHeader extends BaseEntity {

    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
