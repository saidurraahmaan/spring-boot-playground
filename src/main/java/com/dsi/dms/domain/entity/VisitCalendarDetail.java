package com.dsi.dms.domain.entity;

import jakarta.persistence.*;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "visit_calendar_detail")
public class VisitCalendarDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name="visit_calender_id")
    private InstituteVisitCalendar instituteVisitCalendar;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name="educational_institution_id")
    private EducationalInstitute educationalInstitute;
}