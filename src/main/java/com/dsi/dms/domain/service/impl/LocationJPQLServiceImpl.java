package com.dsi.dms.domain.service.impl;

import com.dsi.dms.domain.dto.Location;
import com.dsi.dms.domain.repository.LocationRepository;
import com.dsi.dms.domain.service.LocationJPQLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class LocationJPQLServiceImpl implements LocationJPQLService {

    private final LocationRepository locationRepository;

    public LocationJPQLServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocation() {
        log.info("in the location service");
        return locationRepository.getAllLocationUsingJPQL();
    }
}
