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
public class CategoryUser extends AbstractEntity {

    @ManyToOne(optional = false)
    private Category category;

//    todo: task permissions yozilishi kerak(ENUM)
}
