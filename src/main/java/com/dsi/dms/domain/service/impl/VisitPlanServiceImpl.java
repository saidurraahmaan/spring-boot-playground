package com.dsi.dms.domain.service.impl;

import com.dsi.dms.domain.dto.PlanCalendar;
import com.dsi.dms.domain.dto.PlanCalendarDetails;
import com.dsi.dms.domain.dto.PlanCalendarSearchParams;
import com.dsi.dms.domain.entity.VisitCalendarDetail;
import com.dsi.dms.domain.repository.VisitCalenderRepository;
import com.dsi.dms.domain.service.VisitPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitPlanServiceImpl implements VisitPlanService {
    private final VisitCalenderRepository visitCalenderRepository;

    VisitPlanServiceImpl(VisitCalenderRepository visitCalenderRepository){
        this.visitCalenderRepository = visitCalenderRepository;
    }

    @Override
    public List<VisitCalendarDetail> getVisitCalenderDetails() {
        return visitCalenderRepository.getFilteredPlanDetails();
    }
}
