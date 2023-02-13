package uz.pdp.clickupsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickupsystem.entity.template.AbstractEntity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class ClickApps extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "initial_letter", nullable = false)
    private String initialLetter;

    @ManyToOne(optional = false)
    private Icon icon;
}
