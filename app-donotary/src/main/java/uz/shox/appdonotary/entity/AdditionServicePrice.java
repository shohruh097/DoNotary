package uz.shox.appdonotary.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.shox.appdonotary.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"service_price_id","additional_service_id"})
})
public class AdditionServicePrice extends AbsEntity {

    @ManyToOne(optional = false)
    private ServicePrice servicePrice;

    @ManyToOne(optional = false)
    private AdditionalService additionalService;

    @Column(nullable = false)
    private double price;

    private boolean active;
}
