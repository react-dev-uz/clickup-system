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

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class WorkspaceUser extends AbstractEntity {

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Workspace workspace;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private WorkspaceRole role;

    @Column(name = "invited_date")
    private Date invitedDate;

    @Column(name = "joined_date")
    private Date joinedDate;
}
