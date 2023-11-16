
package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.InstituteVisitCalenderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "institute_visit_calendar")
public class InstituteVisitCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="visit_plan_id")
    private EducationInstituteVisitPlan educationInstituteVisitPlan;

    @ManyToOne
    @JoinColumn(name="officer_id")
    private Officer officer;

    @ManyToOne
    @JoinColumn(name="office_id")
    private Office office;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private InstituteVisitCalenderStatus instituteVisitCalenderStatus;

    @Column(name = "submitted_on")
    private Date submittedOn;

    @Column(name = "approved_or_rejected_on")
    private Date approvedOrRejectedOn;

}