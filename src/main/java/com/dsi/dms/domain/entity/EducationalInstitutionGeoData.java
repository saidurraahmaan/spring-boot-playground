package com.dsi.dms.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "educational_institute_geo_data")
public class EducationalInstitutionGeoData {
    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "educational_institute_id")
    private Location location;

    @Column(name = "building_number")
    private String buildingNumber;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

}
