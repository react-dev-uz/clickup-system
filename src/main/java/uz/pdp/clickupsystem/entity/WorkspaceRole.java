package uz.pdp.clickupsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class WorkspaceRole extends AbstractEntity {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Workspace workspace;

    @Column(nullable = false, unique = true)
    private String name;

//    todo role permissions qo'shiladi
}
