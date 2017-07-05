package com.institutionsadventis.repositories;

import com.institutionsadventis.persistence.District;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */
public interface DistrictRepository extends CrudRepository<District,Integer> {


    public List<District> findByActive(boolean active);

    public District findByDistrict(String district);
}
