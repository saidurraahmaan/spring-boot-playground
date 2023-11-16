package com.dsi.dms.domain.repository;

import com.dsi.dms.domain.dto.Location;

import java.util.List;

public interface LocationRepository {

    List<Location> getAllLocationUsingJPQL();

}
