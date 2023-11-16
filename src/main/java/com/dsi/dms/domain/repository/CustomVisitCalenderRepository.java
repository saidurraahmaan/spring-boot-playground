package com.dsi.dms.domain.repository;

import com.dsi.dms.domain.dto.PlanCalendarDetails;
import com.dsi.dms.domain.dto.PlanCalendarSearchParams;
import com.dsi.dms.domain.entity.InstituteVisitCalendar;
import com.dsi.dms.domain.entity.VisitCalendarDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomVisitCalenderRepository{
    List<VisitCalendarDetail> getFilteredPlanDetails();
}
