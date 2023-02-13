package uz.pdp.clickupsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickupsystem.entity.template.AbstractEntity;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Space extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(name = "initial_letter", nullable = false)
    private String initialLetter;

    @Column(name = "access_type", nullable = false)
    private String accessType;

    @Column(nullable = false)
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    private Icon icon;

    @OneToOne
    private Attachment attachment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Workspace workspace;

    @ManyToMany
    private Set<User> user;
}
