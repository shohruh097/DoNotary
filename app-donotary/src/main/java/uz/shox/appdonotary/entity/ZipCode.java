package uz.shox.appdonotary.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.shox.appdonotary.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ZipCode extends AbsEntity {

    @Column(nullable = false,unique = true)
    private String code;

    @ManyToOne(optional = false)
    private County county;

    @Column(nullable = false)
    private String city;

    private boolean active;
}
