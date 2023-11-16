package com.dsi.dms.domain.repository.impl;

import com.dsi.dms.domain.dto.PlanCalendarDetails;
import com.dsi.dms.domain.dto.PlanCalendarSearchParams;
import com.dsi.dms.domain.entity.InstituteVisitCalendar;
import com.dsi.dms.domain.entity.VisitCalendarDetail;
import com.dsi.dms.domain.repository.CustomVisitCalenderRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class VisitCalenderRepositoryImpl implements CustomVisitCalenderRepository{
    @PersistenceContext
    private final EntityManager entityManager;
    public VisitCalenderRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<VisitCalendarDetail> getFilteredPlanDetails() {

        var jpql = new StringBuilder();
        jpql.append("SELECT vc FROM InstituteVisitCalendar vc " +
                "LEFT JOIN vc.visitCalendarDetail vcd " +
                "LEFT JOIN vcd.educationalInstitute ei " +
                "WHERE 1=1 " +
                "AND vc.officerId = :officerId");

        var parameters = new HashMap<String, Object>();

//        if (StringUtils.hasLength(planCalendarSearchParams.getIsasCategory())) {
//            jpql.append("and  like :name ");
//            parameters.put("name", "%" + planCalendarSearchParams.getName() + "%");
//        }

        parameters.put("officerId", 1);
//        parameters.put("startDateRange", "2024-11-01");
//        parameters.put("endDateRange", "2024-11-30");
        TypedQuery<InstituteVisitCalendar> query = entityManager.createQuery(jpql.toString(), InstituteVisitCalendar.class);

        parameters.forEach((key, value) -> query.setParameter(key, value));

        List<VisitCalendarDetail> list = new ArrayList<>();
        return list;
    }
}
