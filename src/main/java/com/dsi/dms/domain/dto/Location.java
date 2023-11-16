package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.LocationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private long id;
    private String bbsCode;
    private String nameBn;
    private String nameEn;
    private String path;
    private LocationType type;

}
