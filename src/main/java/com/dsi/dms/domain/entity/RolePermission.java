package com.dsi.dms.domain.entity;

import com.dsi.dms.domain.enums.Permission;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "role_permission")
public class RolePermission
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "permission_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private Permission permissionName;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;
}
