package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.OfficeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "office")
public class Office {
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private OfficeType type;

    @Column(name = "stuff_count")
    private Integer stuffCount;

    @Column(name = "name_bn")
    private String nameBn;

    @Column(name = "name_en")
    private String nameEn;
}
