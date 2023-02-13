package uz.pdp.clickupsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class CheckListItem extends AbstractEntity {

    private String name;

    private boolean resolved = false;

    @ManyToOne(optional = false)
    private CheckList checkList;

    @ManyToMany
    private Set<User> assignedUsers;
}
