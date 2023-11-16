package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.OfficerType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "officer")
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "index_number")
    private String indexNumber;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private OfficerType type;

    @Column(name = "is_mpo")
    private Boolean isMPO;

    @Column(name = "status")
    private String status;

}