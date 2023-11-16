package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.TeacherType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "index_number")
    private String indexNumber;

    @ManyToOne
    @JoinColumn(name = "educational_institution_id")
    private EducationalInstitute educationalInstitute;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TeacherType type;

    @Column(name = "is_mpo")
    private Boolean isMPO;

    @Column(name = "status")
    private String status;

}