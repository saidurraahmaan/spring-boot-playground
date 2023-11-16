package com.dsi.dms.domain.dto;

import com.dsi.dms.domain.enums.OfficerType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlanCalendar {

    private long id;
    private String name;
    private OfficerType designation;
    private String phone;
    private List<PlanCalendarDetails> visits;


}
