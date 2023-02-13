package uz.pdp.clickupsystem.entity;

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
public class ProjectUser extends AbstractEntity {

    @ManyToOne(optional = false)
    private Project project;

    @ManyToOne(optional = false)
    private User user;

//    todo: task uchun permissions qo'shilishi kerak
}
