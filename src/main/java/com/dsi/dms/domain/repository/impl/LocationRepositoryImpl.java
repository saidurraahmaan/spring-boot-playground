package com.dsi.dms.domain.repository.impl;

import com.dsi.dms.domain.dto.Location;
import com.dsi.dms.domain.repository.LocationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class LocationRepositoryImpl implements LocationRepository {

    private final EntityManager entityManager;

    public LocationRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Location> getAllLocationUsingJPQL() {

        Query query = entityManager.createQuery("" +
                        "SELECT l1 " +
                        "FROM Location l1 " +
                        "where l1.id=:locationId",
                Location.class);
        query.setParameter("locationId", 2);

        var result = query.getResultList();
        List<Location> locationDto = new ArrayList<>();
        for (Object location:result){

             if (location instanceof com.dsi.dms.domain.entity.Location locationEntity) {
                 Location loc = new Location();
                 loc.setId(locationEntity.getId());
                 loc.setNameEn(locationEntity.getNameEn());
                 locationDto.add(loc);
            } else {
                // Handle the case where the object is not of type Location
                log.warn("Unexpected object type in result list: " + location.getClass());
            }
        }
        return locationDto;
    }
}
