package uz.shox.appdonotary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.shox.appdonotary.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"fromTime", "main_service_id"}),
        @UniqueConstraint(columnNames = {"tillTime", "main_service_id"})})
public class MainServiceWorkTime extends AbsEntity {

    @ManyToOne
    private MainService mainService;

    private String fromTime;

    private String tillTime;

    private double percent;

    private boolean active;
}
