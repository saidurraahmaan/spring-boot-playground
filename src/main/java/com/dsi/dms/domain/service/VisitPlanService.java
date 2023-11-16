package com.dsi.dms.domain.service;

import com.dsi.dms.domain.dto.PlanCalendar;
import com.dsi.dms.domain.dto.PlanCalendarDetails;
import com.dsi.dms.domain.dto.PlanCalendarSearchParams;
import com.dsi.dms.domain.entity.VisitCalendarDetail;
import org.springframework.stereotype.Service;

import java.util.List;


public interface VisitPlanService {
//    PlanCalendarDetails addVisitPlan(List<PlanCalendarDetails> visits);
//    PlanCalendar getAUserVisitPlan(PlanCalendarSearchParams searchParams);
//    List<PlanCalendar> getJurisdictionVisitPlan(PlanCalendarSearchParams searchParams);

    List<VisitCalendarDetail> getVisitCalenderDetails();

}