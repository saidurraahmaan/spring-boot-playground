package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.EducationalInstituteVisitPlanStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@Entity
@Table(name = "education_institute_visit_plan")
public class EducationInstituteVisitPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "plan_year")
    private String planYear;

    @Column(name = "submission_deadline")
    private Date submissionDeadline;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private EducationalInstituteVisitPlanStatus status;

    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;
}


