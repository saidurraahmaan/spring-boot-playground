package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.Permission;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "jurisdictionwise_user_role")
public class JurisdictionwiseUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "permission_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private Permission permissionName;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    @Column(name = "jurisdiction_location_path")
    private String jurisdictionLocationPath;

    //TODO : Add JurisdictionInstitutionId after discussion

    @Column(name = "is_primary")
    private boolean isPrimary;
}
