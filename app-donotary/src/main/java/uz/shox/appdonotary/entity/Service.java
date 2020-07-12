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
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"main_service_id", "sub_service_id"})})
public class Service extends AbsEntity {

    @ManyToOne(optional = false)
    private MainService mainService;

    @ManyToOne(optional = false)
    private SubService subService;

    @Column(nullable = false)
    private Integer initialCount;

    @Column
    private Integer initialSpendingTime;

    private Integer everyCount;

    private Integer everySpendingTime;

    private boolean dynamic;

    private boolean active;


}
