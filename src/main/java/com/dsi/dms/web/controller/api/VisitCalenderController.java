package com.dsi.dms.web.controller.api;


import com.dsi.dms.domain.entity.VisitCalendarDetail;
import com.dsi.dms.domain.repository.VisitCalenderRepository;
import com.dsi.dms.domain.service.VisitPlanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/visitcalender")
public class VisitCalenderController {
    private final VisitPlanService visitPlanService;

    VisitCalenderController(VisitPlanService visitPlanService){
        this.visitPlanService = visitPlanService;
    }

    @GetMapping("")
    public List<VisitCalendarDetail> getVisitCalenderDetails(){
        return visitPlanService.getVisitCalenderDetails();
    }
}
