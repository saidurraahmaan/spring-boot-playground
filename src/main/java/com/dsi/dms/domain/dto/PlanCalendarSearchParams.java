package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.IsasCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class PlanCalendarSearchParams {
    private IsasCategory isasCategory;
    private String path;
    private Date startDate;
    private Date endDate;

}
