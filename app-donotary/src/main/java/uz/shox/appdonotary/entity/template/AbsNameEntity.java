package uz.shox.appdonotary.entity.template;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class AbsNameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    private boolean active = true;

    @Column(columnDefinition = "text")
    private String description;


}

