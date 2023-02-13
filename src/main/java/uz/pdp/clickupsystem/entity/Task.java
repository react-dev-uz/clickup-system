package uz.pdp.clickupsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickupsystem.entity.template.AbstractEntity;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Task extends AbstractEntity {

    private String name;

    private String description;

    @Column(name = "started_date")
    private Date startedDate;

    @Column(name = "stopped_date")
    private Date stoppedDate;

    @Column(name = "started_time_has")
    private Time startTimeHas;  // tugash vaqti soatlarda

    @Column(name = "stopped_time_has")
    private Time stoppedTimeHas;

    private Long estimeteTime;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne
    private Status status;

//    todo: parent_task_id

    @ManyToOne
    private Priority priority;

}
