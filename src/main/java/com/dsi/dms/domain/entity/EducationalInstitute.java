package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.EducationalInstituteType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "educational_institute")
public class EducationalInstitute {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "eiin")
    private String eiin;

    @Column(name = "isas_category")
    private String isasCategory;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private EducationalInstituteType type;

    @Column(name = "number_of_buildings")
    private Integer numberOfBuildings;

    @Column(name = "name_bn")
    private String nameBn;

    @Column(name = "name_en")
    private String nameEn;
}
