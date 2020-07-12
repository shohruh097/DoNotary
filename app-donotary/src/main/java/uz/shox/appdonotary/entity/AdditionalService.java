package uz.shox.appdonotary.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.shox.appdonotary.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class AdditionalService extends AbsNameEntity {

}
