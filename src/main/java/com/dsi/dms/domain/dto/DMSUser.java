package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.UserType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DMSUser
{
    private int userId;
    private String pdsNumber;
    private String userName;
    private String email;
    private String phone;
    private UserType type;
    private String fullNameBangla;
    private String fullNameEnglish;
    private String designationEnglish;
    private String getDesignationBangla;
    private RolewiseJurisdiction activeJurisdiction;
    private List<RolewiseJurisdiction> jurisdictions;

}
