package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.IsasCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class PlanCalendarDetails {
    private long id;
    private long officerId;
    private String locationPath;
    private String institutionName;
    private Date visitPlanDate;
    private String eiin;
    private List<Date> visitedDate;
}

