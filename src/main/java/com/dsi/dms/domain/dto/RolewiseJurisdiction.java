package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.JurisdictionLevel;


public class RolewiseJurisdiction
{
    private int districtId;
    private int upazillaId;
    private int zoneId;
    private String path;
    private String roleName;

    private String roleId;

    private JurisdictionLevel jurisdictionLevel;

    public void setPath(String path)
    {
        this.path = path;
        var pathSplits = path.split("/");
        jurisdictionLevel = JurisdictionLevel.NATIONAL;

        if (pathSplits.length > 0)
        {
            zoneId = Integer.parseInt(pathSplits[0]);
            jurisdictionLevel = JurisdictionLevel.ZONAL;
        }

        if (pathSplits.length > 1)
        {
            districtId = Integer.parseInt(pathSplits[1]);
            jurisdictionLevel = JurisdictionLevel.DISTRICT;
        }

        if (pathSplits.length > 2)
        {
            upazillaId = Integer.parseInt(pathSplits[2]);
            jurisdictionLevel = JurisdictionLevel.UPAZILLA;
        }
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public int getDistrictId()
    {
        return districtId;
    }

    public int getUpazillaId()
    {
        return upazillaId;
    }

    public int getZoneId()
    {
        return zoneId;
    }

    public String getPath()
    {
        return path;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public String getRoleId()
    {
        return roleId;
    }

    public JurisdictionLevel getJurisdictionLevel()
    {
        return jurisdictionLevel;
    }
}
