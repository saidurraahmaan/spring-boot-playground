package com.dsi.dms.domain.repository;

import com.dsi.dms.domain.entity.InstituteVisitCalendar;
import org.springframework.data.repository.CrudRepository;

public interface VisitCalenderRepository extends CrudRepository<InstituteVisitCalendar,Long>,CustomVisitCalenderRepository {

}
