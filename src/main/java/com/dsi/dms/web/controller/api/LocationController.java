package com.dsi.dms.web.controller.api;


import com.dsi.dms.domain.dto.Location;
import com.dsi.dms.domain.service.LocationJPQLService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/locationjpql")
@Slf4j
public class LocationController {


    private final LocationJPQLService locationJPQLService;

    public LocationController(LocationJPQLService locationJPQLService) {
        this.locationJPQLService = locationJPQLService;
    }

    @GetMapping("")
    public List<Location> getAllLocationUsingJQPL(){

        return locationJPQLService.getAllLocation();
    }
}
