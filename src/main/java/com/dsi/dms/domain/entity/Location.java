package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.LocationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "location")
public class Location
{
    @Id
    private int id;

    @Column(name = "bbs_code" , nullable = false)
    private String bbsCode;

    @Column(name = "path", nullable = false)
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")

    private Location location;

    @Column(name = "name_en", nullable = false)
    private String nameEn;

    @Column(name = "name_bn", nullable = false)
    private String nameBn;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private LocationType type;

    @Column(name="emis_id", nullable = false)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int emisId;

}
