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
        @UniqueConstraint(columnNames = {"service_id","zip_code_id"})})
public class ServicePrice extends AbsEntity {

    @ManyToOne(optional = false)
    private Service service;

    @ManyToOne(optional = false)
    private ZipCode zipCode;

    @Column(nullable = false)
    private double price;

    private boolean active;

    private Integer chargeMinute;

    private double chargePercent;

}
